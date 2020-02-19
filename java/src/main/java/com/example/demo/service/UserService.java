package com.example.demo.service;

import com.example.demo.entity.dto.UserInfoDto;
import com.example.demo.entity.request.UserLoginForm;

import java.util.List;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 15:09
 * @Description:
 * @Version: 1.0.0
 **/
public interface UserService {
    void userLogin(UserLoginForm userLoginForm);

    List<UserInfoDto> listUser();
}
