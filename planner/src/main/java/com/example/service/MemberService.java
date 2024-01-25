package com.example.service;

import com.example.domain.Member;
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
            System.out.println("로그인 처리 시도");
//            if(member.get().getPasswordHash().matches())
        }
        return member.get();
    }
}
