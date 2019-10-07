import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    //this line means we can use the instance of Calculator inside the tests
    private Calculator calculator;

    //create an instance of the Calculator class, so we can test the Calculator
    @Before
    public void before() {
        calculator = new Calculator();
    }


    //test whether the calculator can add two integers
    @Test
    public void canAdd() {
        //        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }


    //test whether the calculator can subtract one integer from another
    @Test
    public void canSubtract() {
        assertEquals(4, calculator.subtract(10, 6));
    }

    //test whether the calculator can multiply two integers
    @Test
    public void canMultiply() {
        assertEquals(18, calculator.multiply(6, 3));
    }

    //test whether the calculator can divide one double by another double
    @Test
    public void canDivide() {
        assertEquals(3, calculator.divide(9, 3), 0.1);
    }

}
