package com.example.nangbomi.food.entity;

import jakarta.persistence.AttributeConverter;

public class FoodPositionConverter implements AttributeConverter<FoodPosition, Integer> {


    @Override
    public Integer convertToDatabaseColumn(FoodPosition foodPosition) {
        return foodPosition.getCode();
    }

    @Override
    public FoodPosition convertToEntityAttribute(Integer dbData) {
        return FoodPosition.valueOf(dbData);
    }
}
