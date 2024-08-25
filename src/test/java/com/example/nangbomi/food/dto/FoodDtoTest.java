package com.example.nangbomi.food.dto;

import com.example.nangbomi.food.entity.FoodPosition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class FoodDtoTest {

    @Test
    public void FoodDto_테스트() {
        //given
        String foodName = "바나나";
        Instant registerDate = Instant.now();
        Instant expirationDate = Instant.now().plusSeconds(10);
        Integer quantity = 3;
        String comment = "세 번째 서랍 안쪽";
        FoodPosition foodPosition = FoodPosition.valueOf(2);
        FoodDto expected = new FoodDto(foodName, registerDate, expirationDate, quantity,comment, foodPosition);

        //when

        //then
        assertThat(expected.getRegisterDate()).as("Check foodName").isEqualTo(registerDate);
        assertThat(expected.getExpirationDate()).as("Check registerDatd").isEqualTo(expirationDate);
        assertThat(expected.getQuantity()).as("Check quantity").isEqualTo(quantity);
        assertThat(expected.getComment()).as("Check comment").isEqualTo(comment);
        assertThat(expected.getFoodPosition()).as("Check foodPosition").isEqualTo(foodPosition);
    }
}