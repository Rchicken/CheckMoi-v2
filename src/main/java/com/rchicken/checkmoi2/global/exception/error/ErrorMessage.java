package com.rchicken.checkmoi2.global.exception.error;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {
    ENTITY_NOT_FOUND("찾을 수 없는 엔티티입니다.", HttpStatus.NOT_FOUND),

    USER_NOT_FOUND("해당하는 유저를 찾을 수 없습니다", HttpStatus.NOT_FOUND),
    USER_ALREADY_EXIST("해당하는 유저가 이미 존재합니다", HttpStatus.CONFLICT),

    INVALID_INPUT("유효하지 않은 입력값 입니다.", HttpStatus.BAD_REQUEST),
    INVALID_TYPE("유효하지 않은 타입값 입니다.", HttpStatus.BAD_REQUEST),

    ACCESS_DENIED("접근 권한이 없습니다", HttpStatus.FORBIDDEN),
    LOGIN_REQUIRED("로그인이 필요합니다", HttpStatus.UNAUTHORIZED),
    LOGIN_FAILED("로그인 정보가 일치하지 않습니다", HttpStatus.UNAUTHORIZED),

    INVALID_TOKEN("유효하지 않은 토큰입니다", HttpStatus.UNAUTHORIZED),
    EXPIRED_ACCESS_TOKEN("만료된 액세스 토큰입니다", HttpStatus.UNAUTHORIZED),

    SERVER_ERROR("서버 에러 입니다", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String message;

    private final HttpStatus status;
}
