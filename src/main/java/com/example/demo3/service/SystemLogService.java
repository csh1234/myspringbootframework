package com.example.demo3.service;

import com.example.demo3.config.univesal.Service;
import com.example.demo3.entity.SystemLog;

/**
 * @author: CSH
 * @description: 系统日志服务接口
 * @create: 2020-04-24 16:14
 **/
public interface SystemLogService extends Service<SystemLog> {

    @Override
    Integer insert(SystemLog model);
}
