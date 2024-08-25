package com.example.nangbomi.user.dto;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.time.Instant;


class UserDtoTest {

    @Test
    public void UserDto_테스트() {
        //given
        String name = "홍길동";
        String nickname = "동해번쩍";
        Instant createdTime = Instant.now();
        Instant updatedTime = Instant.now();

        UserDto expected = new UserDto(name, nickname, createdTime, updatedTime);


        //when

        //then
        assertThat(expected.getName()).as("Check userName").isEqualTo(name);
        assertThat(expected.getNickname()).as("Check userNickname").isEqualTo(nickname);
        assertThat(expected.getCreatedTime()).as("Check typeCreatedTime").isEqualTo(createdTime);
        assertThat(expected.getUpdatedTime()).as("Check typeUpdatedTime").isEqualTo(updatedTime);
    }

}