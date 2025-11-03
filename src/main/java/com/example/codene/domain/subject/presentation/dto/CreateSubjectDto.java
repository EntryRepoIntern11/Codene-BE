package com.example.codene.domain.subject.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateSubjectDto {

    private String title;

    private String contents;

    private String author;  // 주제 작성자
}
