package com.example.demo3.service;

import com.example.demo3.config.univesal.Service;
import com.example.demo3.entity.User;
import com.github.pagehelper.PageInfo;

/**
 * @author: CSH
 * @description: 用户接口
 * @create: 2020-04-24 09:46
 **/
public interface UserService extends Service<User> {

    PageInfo<User> selectAll(Integer page, Integer size);

    @Override
    User selectById(String id);
}
