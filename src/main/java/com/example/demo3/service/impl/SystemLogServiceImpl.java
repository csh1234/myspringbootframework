package com.example.demo3.service.impl;

import com.example.demo3.config.univesal.AbsratctService;
import com.example.demo3.dao.SystemLogMapper;
import com.example.demo3.entity.SystemLog;
import com.example.demo3.service.SystemLogService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: CSH
 * @description:
 * @create: 2020-04-24 16:18
 **/
@Service
public class SystemLogServiceImpl extends AbsratctService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper mapper;

    @Override
    public Integer insert(SystemLog model) {
        int i = mapper.insert(model);
        return i;
    }
}
