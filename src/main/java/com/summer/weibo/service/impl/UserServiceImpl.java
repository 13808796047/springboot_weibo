package com.summer.weibo.service.impl;

import com.summer.weibo.Repository.UserRepository;
import com.summer.weibo.entity.User;
import com.summer.weibo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Summer
 * @Since 2022/3/20 10:04 PM
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
