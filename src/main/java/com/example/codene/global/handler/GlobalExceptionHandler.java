package com.example.codene.global.handler;

import com.example.codene.global.exception.CodeneException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CodeneException.class)
    public ResponseEntity<String> handleCodeneException(CodeneException e) {
        return ResponseEntity.status(e.getErrorCode().getHttpStatus()).body(e.getMessage());
    }
}
