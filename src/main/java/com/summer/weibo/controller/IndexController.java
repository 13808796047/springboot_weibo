package com.summer.weibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Summer
 * @Since 2022/3/20 12:04 PM
 * @Version 1.0
 */
@Controller
@RequestMapping("/")
public class IndexController {
   @GetMapping()
   public String index(){
      return "index";
   }
}
