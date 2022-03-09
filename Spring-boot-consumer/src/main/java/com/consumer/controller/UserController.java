package com.consumer.controller;

import com.api.bean.User;
import com.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rrow
 * @date: 2022/3/10 1:39
 */
@RestController
public class UserController {

    // 设置版本号，关闭单一广播，使用群体广播
    // @Reference(version = "1.0",parameters = {"unicast","false"})
    // private UserService userService;

    @Reference              // 使用zookeeper的方式
    private UserService userService;

    @GetMapping("user/{userId}")
    public User getUserByUserId(@PathVariable Integer userId){
        User user = userService.queryUserByUserId(userId);
        return user;
    }
}
