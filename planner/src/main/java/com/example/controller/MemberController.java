package com.example.controller;

import com.example.domain.Member;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class MemberController {
    @Autowired
    private MemberService userService;

    @RequestMapping("/")
    public String root() throws Exception {
        return "index";
    }

    @GetMapping("/signup")
    public String sign(Model model) {
        model.addAttribute("member", new Member());
        return "member/signup";
    }



}
