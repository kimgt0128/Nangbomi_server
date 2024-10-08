package com.example.nangbomi.user.dto;
import lombok.*;
import java.time.Instant;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class UserDto {
    private String name;
    private String nickname;
    private Instant createdTime;
    private Instant updatedTime;
}