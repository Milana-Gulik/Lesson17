package by.itstep.gulik.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
//        arrange
        int a = 10;
        int b = 3;
        int expected = 13;

//        act
        int actual = Calculator.sum(a, b);

//        assert
//        if (expected != actual) {
//            Assert.fail();
//        }
        assertEquals(expected, actual);
    }

    @Test
    public void testSub() {

        int a = 10;
        int b = 3;
        int expected = 7;

        int actual = Calculator.sub(a, b);

//        if (expected != actual) {
//            Assert.fail();
//        }
        assertEquals(expected, actual);
    }

    @Test
    public void testMul() {

        int a = 10;
        int b = 3;
        int expected = 30;

        int actual = Calculator.mul(a, b);

//        if (expected != actual) {
//            Assert.fail();
//        }
        assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {

        int a = 10;
        int b = 3;
        int expected = 3;

        int actual = Calculator.div(a, b);

//        if (expected != actual) {
//            Assert.fail();
//        }
        assertEquals(expected, actual);
    }
}
