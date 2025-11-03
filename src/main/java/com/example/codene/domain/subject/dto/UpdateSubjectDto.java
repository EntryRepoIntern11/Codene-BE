package com.example.codene.domain.subject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateSubjectDto {

    private String title;

    private String contents;
}
