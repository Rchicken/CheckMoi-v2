package com.rchicken.checkmoi2.global.exception;

import com.rchicken.checkmoi2.global.exception.error.ErrorMessage;

public class InvalidValueException extends BusinessException {
    public InvalidValueException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
