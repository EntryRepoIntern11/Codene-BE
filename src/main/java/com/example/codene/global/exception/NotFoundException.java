package com.example.codene.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // 이 예외 발생 시 404 상태 코드를 반환하도록 설정
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}