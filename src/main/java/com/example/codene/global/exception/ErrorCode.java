package com.example.codene.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    EMPTY_ERROR(HttpStatus.BAD_REQUEST, "Empty Error");

    private final HttpStatus httpStatus;
    private final String message;
}
