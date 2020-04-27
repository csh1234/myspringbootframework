package com.example.demo3.entity;

import com.example.demo3.common.BaseSerizebale;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
/**
 * @author: CSH
 * @description: 人信息
 * @create: 2020-04-24 09:37
 **/
@Data
public class User extends BaseSerizebale {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    private String password;

    /**
     * 加密盐值
     */
    private String salt;
}
