package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Jelinjontest {
    @Test
        public void factorialTest() {
            Jelinjon testest  = new Jelinjon();
            int number = 3;
            long expectedResult = 6;

            long result = testest.factorial(number);

            Assertions.assertEquals(expectedResult, result);
//            test
        }
    }