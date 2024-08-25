package com.example.nangbomi.food_type.dto;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class FoodTypeDtoTest {

    @Test
    public void FoodTypeDto_테스트() {
        //given
        String typeName = "fruit";
        String typeCode = "A1002";
        //이후에 Duration 타입의 변수로 변환 후 다시 테스트
        LocalDate expirationPeriod = null;
        String information = "과일은 통상적으로 냉장 보관을 해야 합니다.";
        FoodTypeDto expected = new FoodTypeDto(typeName, typeCode, expirationPeriod, information);

        //when

        //then
        assertThat(expected.getTypeName()).as("Check typeName").isEqualTo(typeName);
        assertThat(expected.getTypeCode()).as("Check typeCode").isEqualTo(typeCode);
        assertThat(expected.getExpirationPeriod()).as("Check expirationPeriod").isEqualTo(expirationPeriod);
        assertThat(expected.getInformation()).as("Check information").isEqualTo(information);

    }
}