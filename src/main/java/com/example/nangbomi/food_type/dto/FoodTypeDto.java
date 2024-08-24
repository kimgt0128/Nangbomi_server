package com.example.nangbomi.food_type.dto;
import lombok.*;
import java.time.LocalDate;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class FoodTypeDto {
    private String typeName;
    private String typeCode;
    private LocalDate expirationPeriod;
    private String information;
}