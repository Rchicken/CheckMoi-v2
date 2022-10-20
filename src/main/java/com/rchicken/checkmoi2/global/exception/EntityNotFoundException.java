package com.rchicken.checkmoi2.global.exception;

import com.rchicken.checkmoi2.global.exception.error.ErrorMessage;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException() {
        super(ErrorMessage.ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException(ErrorMessage message) {
        super(message);
    }
}
