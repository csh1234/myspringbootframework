package com.example.demo3.dao;

import com.example.demo3.config.univesal.Mapper;
import com.example.demo3.entity.SystemLog;

public interface SystemLogMapper extends Mapper<SystemLog> {

    @Override
    int insert(SystemLog log);
}