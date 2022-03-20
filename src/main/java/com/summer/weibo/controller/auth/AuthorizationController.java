package com.summer.weibo.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Summer
 * @Since 2022/3/20 10:20 PM
 * @Version 1.0
 */
@Controller
public class AuthorizationController {
    @GetMapping("login")
    public String showLoginForm() {
        return "auth/login";
    }

    @GetMapping("register")
    public String showRegisterForm() {
        return "auth/register";
    }
}
