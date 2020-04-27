package com.example.demo3.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: CSH
 * @description: 定时任务
 * @create: 2020-04-27 13:50
 **/
@Component
@EnableScheduling
public class BaseTask {

    @Scheduled(fixedRate = 5000)
    public void job1(){
        System.out.println("定时任务1" + new Date());
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void job2(){
        System.out.println("定时任务2" + new Date());
    }
}
