package com.example.demo3.controller;

import com.example.demo3.common.RetResponse;
import com.example.demo3.common.RetResult;
import com.example.demo3.entity.User;
import com.example.demo3.exception.ServiceException;
import com.example.demo3.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: CSH
 * @description: 用户控制层
 * @create: 2020-04-24 10:00
 **/
@Controller
@Api(tags = {"用户操作接口"},description = "UserController")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/testException")
    @ResponseBody
    public RetResult<User> testException(@RequestBody String id) {
        List a = null;
//        a.size();
        User userInfo = userService.selectById(id);
        return RetResponse.makeOKRsp(userInfo);
    }
    /**
     * Swagger  api
     * @param id
     * @return
     */
    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true,
                    dataType = "String", paramType = "query")
    })
    @GetMapping("/selectById")
    @ResponseBody
    public RetResult<User> selectById(@RequestParam String id){
        User user = userService.selectById(id);
        if(user == null){
            throw new ServiceException("暂无该用户");
        }
        RetResult<User> result = RetResponse.makeOKRsp(user);
        return result;
    }


    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "查询用户", notes = "分页查询所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页码",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示条数",
                    dataType = "Integer", paramType = "query")
    })
    @GetMapping("/selectAll")
    @ResponseBody
    public RetResult<PageInfo<User>> selectAll(@RequestParam(defaultValue = "0") Integer page,
                                               @RequestParam(defaultValue = "0") Integer size){
        PageInfo<User> userPageInfo = userService.selectAll(page, size);
        if(userPageInfo == null){
            throw new ServiceException("用户表信息为空");
        }
        RetResult<PageInfo<User>> result = RetResponse.makeOKRsp(userPageInfo);
        return result;
    }
}
