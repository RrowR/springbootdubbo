package com.api.service;

import com.api.bean.User;

/**
 * @author: Rrow
 * @date: 2022/3/10 1:06
 */
public interface UserService {

    User queryUserByUserId(Integer userId);

}
