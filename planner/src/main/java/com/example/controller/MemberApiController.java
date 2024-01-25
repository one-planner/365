package com.example.controller;

import com.example.domain.Member;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
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
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
//        // 로그인 로직 구현
//    }



}
