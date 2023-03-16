package hw2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void add_returnsAdditionOfTwoNumbers(){
        int num = calculator.add(1, 2);
        Assertions.assertEquals(3, num);
    }
    @Test
    public void subtract_returnsSubtractionOfTwoNumbers(){
        int num = calculator.subtract(2, 1);
        Assertions.assertEquals(1, num);
    }
    @Test
    public void multiply_returnsMultiplicationOfTwoNumbers(){
        int num = calculator.multiply(1, 2);
        Assertions.assertEquals(2, num);
    }
    @Test
    public void divide_returnsDivisionOfTwoNumbers(){
        int num = calculator.divide(6, 2);
        Assertions.assertEquals(3, num);
    }
}
