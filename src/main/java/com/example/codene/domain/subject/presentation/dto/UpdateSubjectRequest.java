package com.example.codene.domain.subject.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateSubjectRequest {

    private String title;

    private String contents;
}
