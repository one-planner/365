package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String root() throws Exception {
        return "index";
    }

    @GetMapping("/sign")
    public String sign() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(User user, Model model) {
        model.addAttribute("user", userService.create(user));
        return "signup";
    }
}
