package com.example.nangbomi.refri.dto;
import lombok.*;
import java.time.Instant;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class RefriDto {
    private String refriName;
    private Instant refriCreatedTime;
}