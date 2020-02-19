package com.example.demo.controller;

import com.example.demo.entity.dto.UserInfoDto;
import com.example.demo.entity.request.UserLoginForm;
import com.example.demo.service.UserService;
import com.example.demo.util.MyException;
import com.example.demo.util.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 15:08
 * @Description:
 * @Version: 1.0.0
 **/
@Slf4j
@RestController
@RequestMapping("/demo/user/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseResult userLogin(UserLoginForm userLoginForm){
        log.info("=====登录=====,参数:{}",userLoginForm);
        try {
            userService.userLogin(userLoginForm);
            return new ResponseResult();
        }catch (MyException e){
            return new ResponseResult(e.getCode(),e.getMessage());
        }

    }

    @GetMapping("/list")
    public ResponseResult listUser(){
        log.info("=====查询列表=====");
        List<UserInfoDto> list = userService.listUser();
        return new ResponseResult(list);
    }
}
