import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestCalculator {
    private Calculator testCalculator;


    @Before
    public void setUpClass(){

    }
    @Test
    public void setUp(){
    testCalculator = new Calculator(3, 4);
    }
    @Test
    public void sumTest(){
        testCalculator = new Calculator(4,5);
        assertThat(9, is(testCalculator.sum()));


    }
    @Test
    public void difTest(){
        testCalculator = new Calculator(6,5);
        assertThat(1, is(testCalculator.dif()));

    }
    @Test
    public void mulTest(){
        testCalculator = new Calculator(4,5);
        assertThat(20, is(testCalculator.mul()));

    }
    @Test
    public void divTest(){
        testCalculator = new Calculator(21,7);
        assertThat(3, is(testCalculator.div()));

    }
    @Test
    public void difUnderZero(){
        testCalculator = new Calculator(30,35);
        assertThat(-5, is (testCalculator.dif()));
    }
    @Test
    public void testMulWithZero(){
        testCalculator = new Calculator(0,5);
        assertEquals(0, testCalculator.mul());

    }
}
