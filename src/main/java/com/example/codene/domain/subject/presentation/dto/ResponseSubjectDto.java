package com.example.codene.domain.subject.presentation.dto;

import lombok.Getter;

@Getter
public class ResponseSubjectDto {

    private Long id;

    private String title;

    private String contents;

    private String author;  // 주제 작성자, 변경 필요
}
