package com.example.demo.util;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 17:00
 * @Description:
 * @Version: 1.0.0
 **/
public enum ResponseCode {
    USER_LOGIN_INVALID(10001,"用户登录无效")
    ;
    private int code;
    private String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    ResponseCode() {
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
