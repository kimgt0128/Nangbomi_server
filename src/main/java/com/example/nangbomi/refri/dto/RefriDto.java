package com.example.nangbomi.refri.dto;
import lombok.*;
import java.time.Instant;

@Getter
public class RefriDto {
    private String refriName;
    private Instant refriCreatedTime;
    private Long userId;  // Assuming you only want to pass the ID of the User
}