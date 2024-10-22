package sample;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import org.junit.Test;

public class CalculatorRequestReaderTest {

    @Test
    public void System_in으로_데이터를_읽어들일_수_있다() {
        // given
        CalculatorRequestReader calculationRequestReader = new CalculatorRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        String[] result = calculationRequestReader.read();

        // then
        assertEquals("2", result[0]);
        assertEquals("+", result[1]);
        assertEquals("3", result[2]);
    }
}
