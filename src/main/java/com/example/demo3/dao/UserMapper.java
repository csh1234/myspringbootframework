package com.example.demo3.dao;

import com.example.demo3.config.univesal.Mapper;
import com.example.demo3.entity.User;

import java.util.List;

/**
 * 接口
 */
public interface UserMapper extends Mapper<User> {


    /**
     * 查询全部
     * @return
     */
    List<User> selectAll();

    /**
     *
     * @param id
     * @return
     */
    User selectById(String id);

}
