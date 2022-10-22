package com.rchicken.checkmoi2.global;

import com.rchicken.checkmoi2.global.model.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "헬스체크", description = "헬스체크 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/health")
public class HealthApi {

    @Operation(summary = "healthy", description = "어플리케이션의 실행 상태를 확인하는 API")
    @GetMapping
    public ResponseEntity<SuccessResponse<String>> healthy() {
        return ResponseEntity.ok(new SuccessResponse<>("CheckMoi v2", LocalDateTime.now()));
    }

}
