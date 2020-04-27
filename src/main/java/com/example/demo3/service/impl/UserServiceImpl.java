package com.example.demo3.service.impl;

import com.example.demo3.config.univesal.AbsratctService;
import com.example.demo3.dao.UserMapper;
import com.example.demo3.entity.User;
import com.example.demo3.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: CSH
 * @description: 实现类,   先继承后实现
 * @create: 2020-04-24 09:48
 **/
@Service
public class UserServiceImpl extends AbsratctService<User> implements UserService  {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectById(String id) {

        return userMapper.selectById(id);
    }

    @Override
    public PageInfo<User> selectAll(Integer page,Integer size) {
        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageHelper.startPage(page, size);
        List<User> userInfoList = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;
    }
}
