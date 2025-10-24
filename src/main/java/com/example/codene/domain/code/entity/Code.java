package com.example.codene.domain.code.entity;

import com.example.codene.domain.user.entity.User;
import jakarta.persistence.*;

@Entity
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 1000)
    private String contents;

    // 프로그래밍 언어 종류
    @Column(length = 20)
    private String language;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
