package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 16:51
 * @Description:
 * @Version: 1.0.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException{
    private int code;
    private String message;

    public MyException(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
    }
}
