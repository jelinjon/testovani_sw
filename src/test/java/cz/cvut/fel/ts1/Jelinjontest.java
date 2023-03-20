package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Jelinjontest {
    @Test
        public void factorialTest() {
            Jelinjon jelinjon  = new Jelinjon();
            int number = 3;
            long expectedResult = 6;

            long result = jelinjon.factorial(number);

            Assertions.assertEquals(expectedResult, result);
        }
    }