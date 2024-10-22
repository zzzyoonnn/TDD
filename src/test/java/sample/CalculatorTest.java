package sample;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(5, result);            // junit assertion
        //assertThat(result).isEqualTo(5);    // assertj assertion
    }

    @Test
    public void 곱셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(6, result);            // junit assertion
        //assertThat(result).isEqualTo(5);    // assertj assertion
    }

    // ctrl + shift + r : 커서 있는 곳의 테스트 실행
    @Test
    public void 뺄셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(-1, result);            // junit assertion
        //assertThat(result).isEqualTo(5);    // assertj assertion
    }

    @Test
    public void 나눗셈_연산을_할_수_있다() {
        // given
        long num1 = 6;
        String operator = "/";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(2, result);            // junit assertion
        //assertThat(result).isEqualTo(5);    // assertj assertion
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        // given
        long num1 = 6;
        String operator = "x";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        //long result = calculator.calculate(num1, operator, num2);

        // then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}
