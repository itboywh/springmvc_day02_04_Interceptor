package com.itboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author wh
 * @date 2021年11月19日21:27
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping("/interecptor")
    public String interecptor() {
        System.out.println("interecptor方法执行了...");
        return "success";
    }
}
