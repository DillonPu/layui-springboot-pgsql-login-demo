package com.example.demo.service.common.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.model.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.common.IUserService;
import com.example.demo.util.MyException;
import com.example.demo.util.ResponseCode;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DillonPu
 * @since 2020-02-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public boolean isExistUser(String username, String userpwd) {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(User::getUsername, username);
        queryWrapper.eq(User::getUserpwd, userpwd);
        User user = baseMapper.selectOne(queryWrapper);
        if (Objects.isNull(user)) {
            throw new MyException(ResponseCode.USER_LOGIN_INVALID);
        }
        return true;
    }
}
