package com.rchicken.checkmoi2.global.model;


import java.time.LocalDateTime;

public record SuccessResponse<T>(T data, LocalDateTime time) {

}
