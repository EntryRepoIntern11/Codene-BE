package com.example.codene.domain.code.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateCodeRequest {

    private String title;

    private String contents;

    private String language;
}
