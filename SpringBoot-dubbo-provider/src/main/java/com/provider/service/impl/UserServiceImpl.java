package com.provider.service.impl;

import com.api.bean.User;
import com.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author: Rrow
 * @date: 2022/3/10 1:09
 */

/*
    用户查询服务
 */
@DubboService(version = "1.0")
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserByUserId(Integer userId) {
        System.out.println("服务的提供方收到请求了 >>>>" + userId);
        User user = new User();
        user.setId(userId);
        user.setName("猫羽雫");
        return user;
    }
}
