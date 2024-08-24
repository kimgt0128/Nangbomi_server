package com.example.nangbomi.food.entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum FoodPosition {
    FREEZER(0),
    REFRIGERATOR(1),
    ROOM(2);

    private final int code;

    public static FoodPosition valueOf(int code) {
        return Arrays.stream(FoodPosition.values())
                .filter(value -> value.getCode() == code)
                .findFirst()
                .orElseThrow(
                        () -> new IllegalArgumentException("유효하지 않은 FoodPosition: " + code)
                );
    }
}
