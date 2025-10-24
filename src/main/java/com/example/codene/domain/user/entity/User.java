package com.example.codene.domain.user.entity;

import com.example.codene.domain.user.enums.CodeChoice;
import com.example.codene.domain.user.enums.SubjectChoice;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private Long studentNumber;

    @Column(length = 60, nullable = false)
    private String password;

    private Double winRate;

    private Long win;

    private Long lose;

    @Column(nullable = false)
    private Boolean isRateOpen = true;

    @Enumerated(EnumType.STRING)
    private CodeChoice codeChoice;

    @Enumerated(EnumType.STRING)
    private SubjectChoice subjectChoice;
}