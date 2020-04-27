package com.example.demo3.controller;

import com.example.demo3.common.RetResponse;
import com.example.demo3.common.RetResult;
import com.example.demo3.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: CSH
 * @description: redis测试管理控制类
 * @create: 2020-04-27 09:05
 **/
@RestController
@Api(tags = {"redis控制类"}, description ="RedisController")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/setRedis")
    @ApiOperation(value = "添加测试缓存")
    public RetResult<String> setRedis(@RequestParam String name){

        redisService.set("name",name);
        return RetResponse.makeOKRsp(name);

    }
    @PostMapping("/getRedis")
    @ApiOperation(value = "获取测试缓存")
    public RetResult<String> getRedis() {
        String name = redisService.get("name");
        return RetResponse.makeOKRsp(name);
    }
}
