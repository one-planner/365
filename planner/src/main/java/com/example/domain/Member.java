package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_id_seq")
    @SequenceGenerator(name = "member_id_seq", sequenceName = "member_id_seq", allocationSize = 1)
    private Long memberId;

    @Column(name = "member_name", nullable = false, length = 50)
    private String membername;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password_hash", nullable = false, length = 64)
    private String passwordHash;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    @Column(name = "purpose", nullable = false, length = 100)
    private String purpose;


}
