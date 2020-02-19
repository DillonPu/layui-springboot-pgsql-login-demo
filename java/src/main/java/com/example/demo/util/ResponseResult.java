package com.example.demo.util;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 16:21
 * @Description:
 * @Version: 1.0.0
 **/
public class ResponseResult<T> {
    private int code = 2000;
    private String message = "success";
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(T data) {
        this.data = data;
    }

    public ResponseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
