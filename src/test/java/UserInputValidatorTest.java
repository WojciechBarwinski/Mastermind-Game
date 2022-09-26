import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserInputValidatorTest {

    UserInputValidator validator = new UserInputValidator();

    @Test
    void checkCorrectInput() {
        //given
        String testInput = "rgbw";
        //when
        boolean result = validator.checkInput(testInput);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void checkIncorrectAndTooLongInput(){
        //given
        String testInput = "rgbwx";
        //when
        boolean result = validator.checkInput(testInput);
        //then
        assertThat(result).isFalse();
        assertThat(validator.getErrorMassage().get(0)).isEqualTo("za dużo znaków");
    }

    @Test
    void checkTwoIncorrectLettersInInput(){
        //given
        String testInput = "lmrg";
        //when
        boolean result = validator.checkInput(testInput);
        //then
        assertThat(result).isFalse();
        assertThat(validator.getErrorMassage().get(0)).isEqualTo("l to niepoprawny znak");
        assertThat(validator.getErrorMassage().get(1)).isEqualTo("m to niepoprawny znak");
    }
}