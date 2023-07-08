package com.birthday.yjn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }

    @PostMapping("/login")
    public RedirectView login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        if ("杨佳宁".equals(username) && "0627".equals(password)) {
            return new RedirectView("/name"); // 跳转到BirthdayCake页面
        } else {
            return new RedirectView("/error"); // 跳转到错误页面
        }
    }

    @GetMapping("/name")
    public String showName() {
        return "name";
    }

    @GetMapping("/BirthdayCake")
    public String showBirthdayCake() {
        return "BirthdayCake";
    }

    @GetMapping("/Video")
    public String showVideo() {
        return "Video";
    }

    @GetMapping("/memories")
    public String showMemories() {
        return "Memories";
    }

    @GetMapping("/EasterEgg")
    public String showEasterEgg() {
        return "EasterEgg";
    }

}
