package com.example.demo3.controller;

import com.example.demo3.common.RetResponse;
import com.example.demo3.common.RetResult;
import com.example.demo3.entity.SystemLog;
import com.example.demo3.exception.ServiceException;
import com.example.demo3.service.SystemLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: CSH
 * @description: 系统日志控制类
 * @create: 2020-04-24 16:14
 **/
@Controller
@Api(tags = {"系统日志操作类"},description = "SystemLogController")
public class SystemLogController {

    @Autowired
    private SystemLogService logService;


    @ApiOperation(value = "系统日志添加")
    @PostMapping("/addlog")
    @ResponseBody
    public RetResult<Integer> add(@RequestBody SystemLog log){
        if (log == null){
            throw new ServiceException("提交的参数不能为空");
        }
        Integer insert = logService.insert(log);
        RetResult<Integer> integerRetResult = RetResponse.makeOKRsp(insert);
        return integerRetResult;
    }
}
