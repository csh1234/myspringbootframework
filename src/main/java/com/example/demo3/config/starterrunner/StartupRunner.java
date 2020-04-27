package com.example.demo3.config.starterrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: CSH
 * @description: 初始静态化资源启动器
 * @create: 2020-04-27 13:36
 **/
@Component
@Order(value = 1)
public class StartupRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("服务器启动成功！<<<<使用ApplicationRunner接口");
    }
}
