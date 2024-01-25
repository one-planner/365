package com.example.controller;

import com.example.domain.Member;
import com.example.dto.LoginDto;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/member")
public class MemberApiController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/{id}")
    public Member read(@PathVariable("id") Long id) {
        return memberService.read(id);
    }

    @PostMapping("")
    public Member create(@ModelAttribute Member member) {
        return memberService.create(member);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@ModelAttribute LoginDto loginDto) {
        System.out.println("login 처리하자");
        boolean isAuthenticated = memberService.authenticate(loginDto);
        return isAuthenticated ? ResponseEntity.ok().build() : ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
