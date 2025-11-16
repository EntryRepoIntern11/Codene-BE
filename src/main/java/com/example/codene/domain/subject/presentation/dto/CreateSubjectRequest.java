package com.example.codene.domain.subject.presentation.dto;

import com.example.codene.domain.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateSubjectRequest {

    private String title;

    private String contents;

    private User user;  // 주제 작성자
}
