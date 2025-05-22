package sit707_week6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3)); // PASS
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2)); // PASS
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiply(2, 3)); // PASS
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(4, 2)); // PASS
    }

    @Test
    public void testFailAddition() {
        assertEquals(6, calc.add(2, 3)); // FAIL
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0); // PASS: expected exception
        });
    }
}