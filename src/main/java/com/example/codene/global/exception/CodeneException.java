package com.example.codene.global.exception;

import lombok.Getter;

@Getter
public class CodeneException extends RuntimeException {
    private final ErrorCode errorCode;
    
    public CodeneException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
