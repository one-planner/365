package com.example.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Planner")
public class Planner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planner_id_seq")
    @SequenceGenerator(name = "planner_id_seq", sequenceName = "planner_id_seq", allocationSize = 1)
    private Long plannerId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Lob
    private String content;

    @Column(nullable = false)
    private Timestamp time;

    private String place;
}
