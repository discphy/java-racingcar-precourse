package racingcar.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarsDtoTest {
    @Test
    void DTO_Cars_변환_예외() {
        assertThatThrownBy(() -> {
            new TrackDto("가").toDomain();
        }).hasMessage("레이싱 트랙 값은 숫자만 가능합니다.");
    }
}
