package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    
    @Test
    void 빈문자열_예외() {
        //given
        String name = "";

        //then
        assertThatThrownBy(() -> {
            Car.of(name);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 공백문자열_예외() {
        //given
        String name = " ";

        //then
        assertThatThrownBy(() -> {
            Car.of(name);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 문자열_5자이하_예외() {
        //given
        String name = "12 345";

        //then
        assertThatThrownBy(() -> {
            Car.of(name);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 앞뒤공백제거만허용_정상_인스턴스_확인() {
        //given
        String name = " 12345";

        //when
        Car car = Car.of(name);

        //then
        assertThat(car.getName()).isEqualTo("12345");
    }
}
