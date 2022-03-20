package com.summer.weibo.service;

import com.summer.weibo.entity.User;

import java.util.List;

/**
 * @Author Summer
 * @Since 2022/3/20 10:02 PM
 * @Version 1.0
 */
public interface UserService {
    List<User> findAllUsers();
}
