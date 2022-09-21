

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CodeComparisonTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumber() {
        //given
        int a = 2;
        int b = 3;
        int expect = 5;
        //when
        int result = calculator.add(a, b);
        //then
        assertThat(result).isEqualTo(expect);
    }
}


class Calculator{

    public int add (int a, int b){
        return a + b;
    }
}