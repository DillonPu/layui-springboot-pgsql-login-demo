package com.example.demo.entity.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 15:28
 * @Description:
 * @Version: 1.0.0
 **/
@Data
public class UserLoginForm implements Serializable {
    private String username;
    private String userpwd;
}
