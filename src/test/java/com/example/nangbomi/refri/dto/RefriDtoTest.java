package com.example.nangbomi.refri.dto;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import static org.assertj.core.api.Assertions.assertThat;


class RefriDtoTest {

    @Test
    public void getRefriName_테스트() {
        //given
        String refriName = "myRefri";
        Instant refriCreatedTime = Instant.now();

        RefriDto expected = new RefriDto(refriName, refriCreatedTime);
        //when

        //then
        assertThat(expected.getRefriName()).as("Check refriName").isEqualTo("myRefri");
        assertThat(expected.getRefriCreatedTime()).as("Check refriCreatedTime").isEqualTo(refriCreatedTime);

    }

}