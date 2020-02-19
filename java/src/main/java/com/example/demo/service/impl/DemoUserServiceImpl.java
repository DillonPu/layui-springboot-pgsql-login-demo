package com.example.demo.service.impl;

import com.example.demo.entity.dto.UserInfoDto;
import com.example.demo.entity.model.User;
import com.example.demo.entity.model.UserInfo;
import com.example.demo.entity.request.UserLoginForm;
import com.example.demo.service.UserService;
import com.example.demo.service.common.IUserInfoService;
import com.example.demo.service.common.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @USER: DillonPu
 * @DATE: 2020/2/19 15:09
 * @Description:
 * @Version: 1.0.0
 **/
@Service
public class DemoUserServiceImpl implements UserService {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IUserInfoService iUserInfoService;

    /**
     * 用户登录业务
     * @param userLoginForm
     */
    @Override
    public void userLogin(UserLoginForm userLoginForm) {
        boolean result = iUserService.isExistUser(userLoginForm.getUsername(),userLoginForm.getUserpwd());
    }

    /**
     * 查询全部用户
     * @param
     * @return
     */
    @Override
    public List<UserInfoDto> listUser() {

        List<UserInfoDto> dataList = new ArrayList<>();
        List<UserInfo> list = iUserInfoService.list();
        Iterator<UserInfo> iterator = list.iterator();
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            UserInfoDto userInfoDto = new UserInfoDto();
            BeanUtils.copyProperties(userInfo,userInfoDto);

            String gender = userInfo.getGender()==1 ? "女":"男";
            userInfoDto.setGender(gender);

            User user = iUserService.getById(userInfo.getUid());
            userInfoDto.setUsername(user.getUsername());

            dataList.add(userInfoDto);
        }

        return dataList;
    }
}
