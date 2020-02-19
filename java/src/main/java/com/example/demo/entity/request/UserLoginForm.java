package com.example.demo.entity.request;

import lombok.Data;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 16:46
 * @Description:
 * @Version: 1.0.0
 **/
@Data
public class UserLoginForm {
    private String username;
    private String userpwd;
}
