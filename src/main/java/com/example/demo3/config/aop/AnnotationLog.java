package com.example.demo3.config.aop;

import java.lang.annotation.*;

/**
 * @author: CSH
 * @description: 创建自定义注解和切面
 * @create: 2020-04-27 13:50
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationLog {

    String remark() default "";
}
