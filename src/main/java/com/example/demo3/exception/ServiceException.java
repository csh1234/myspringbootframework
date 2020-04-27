package com.example.demo3.exception;

import java.io.Serializable;

/**
 * @author: CSH
 * @description: 全局异常
 * @create: 2020-04-24 11:28
 **/
public class ServiceException extends RuntimeException implements Serializable {


    private static final long serialVersionUID = 6277542490332841093L;
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
