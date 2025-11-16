package com.example.codene.domain.code.presentation.dto;

import com.example.codene.domain.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCodeRequest {

    private String title;

    private String contents;

    private String language;

    private User user;
}
