package com.example.codene.domain.subject.entity;

import com.example.codene.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String contents;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    public void updateSubject(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
