package com.example.nangbomi.food.dto;

import com.example.nangbomi.food.entity.FoodPosition;
import java.time.Instant;
import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class FoodDto {
    private String foodName;
    private Instant registerDate;
    private Instant expirationDate;
    private Integer quantity;
    private String comment;
    private FoodPosition foodPosition;


}