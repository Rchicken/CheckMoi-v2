package com.rchicken.checkmoi2.global.model;


import java.time.LocalDateTime;

public record SuccessResponse<T>(T data, LocalDateTime time) {
public static SuccessResponse<T> of(T data){
    return new SuccessResponse<>(data, LocalDateTime.now());
}
}
