package com.rchicken.checkmoi2.global.exception;

import org.springframework.http.HttpStatus;

import com.rchicken.checkmoi2.global.exception.error.ErrorMessage;

public class BusinessException extends RuntimeException {

    private final HttpStatus httpStatus;

    public BusinessException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.httpStatus = errorMessage.getStatus();
    }
}
