package ie.atu.lab10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calculator newCalc;

    @Test
    void testAdd()
    {
        newCalc = new Calculator();
        assertEquals(10, newCalc.add(4,6));
    }

    @Test
    void testSub()
    {
        newCalc = new Calculator();
        assertEquals(6,newCalc.sub(10,4));
    }

    @Test
    void testDiv()
    {
        newCalc = new Calculator();
        assertEquals(3, newCalc.div(12,4));
    }

    @Test
    void testMul()
    {
        newCalc = new Calculator();
        assertEquals(20,newCalc.mul(5,4));
    }
}
