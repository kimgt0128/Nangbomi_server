package com.example.nangbomi.food.dto;

import com.example.nangbomi.food.entity.FoodPosition;
import java.time.Instant;
import lombok.*;

@Getter
@Builder
public class FoodDto {
    private Instant registerDate;
    private Instant expirationDate;
    private Integer quantity;
    private String comment;
    private FoodPosition foodPosition;
}