package project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestedClassTest {

    public TestedClass tested;

    @Before
    public void initialize() {
        tested = new TestedClass();
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2d, tested.divide(6,3), 0.00001d);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZer0() {
        tested.divide(1, 0);
    }
}
