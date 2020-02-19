package com.example.demo.service.common;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author DillonPu
 * @since 2020-02-19
 */
public interface IUserService extends IService<User> {

    boolean isExistUser(String username, String userpwd);
}
