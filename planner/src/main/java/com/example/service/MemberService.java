package com.example.service;

import com.example.domain.Member;
import com.example.dto.LoginDto;
import com.example.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder pEncoder;

    public Member create(Member member) {
        member.setPasswordHash(pEncoder.encode(member.getPasswordHash()));
        return memberRepository.save(member);
    }

    public Member read(Long id) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isPresent()) {
            return member.get();
        }
        return member.get();
    }

    public boolean authenticate(LoginDto loginDto) {
//        loginDto.setPassword(pEncoder.encode(loginDto.getPassword()));
        Optional<Member> member = memberRepository.findByEmail(loginDto.getEmail());
        if (member.isPresent()) {
            if (pEncoder.matches(loginDto.getPassword(), member.get().getPasswordHash())) {
//            if (member.get().getPasswordHash().matches(loginDto.getPassword())) {
                System.out.println("로그인 성공!");
                return true;
            }
        }
        System.out.println("로그인 실패!");
        return false;
    }
}
