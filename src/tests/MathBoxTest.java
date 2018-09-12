package tests;

import org.junit.Test;
import utils.MathBox;

import static org.junit.Assert.*;

public class MathBoxTest {

    @Test
    public void summatorDoublesTest() {
        Double[] data = {345.667, 44.5, 2.334455};
        MathBox mb = new MathBox(data);
        Double expRes = 392.50145499999996;
        Double actRes = mb.summator();
        assertEquals(expRes, actRes);


    }

    @Test
    public void summatorIntsTest() {
        Integer[] data = {34, 785, -23, 45, 0, 97};
        MathBox mb = new MathBox(data);
        Double expRes = 938.0D;
        Double actRes = mb.summator();
        assertEquals(expRes, actRes);
    }


    @Test
    public void splitterDoublesTest() {
        Double[] data = {12.6674, 34.0, 44.5, 1.00056, 3.14};
        MathBox mb = new MathBox(data);
        double divider = 2.0;
        double[] expRes = {0.50028, 1.57, 6.3337, 17.0, 22.25};
        double[] actRes = mb.splitter(divider);
        assertArrayEquals(expRes, actRes, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void splitterZeroDivExcepTest() {
        Double[] data = {12.6674, 34.0, 44.5, 1.00056, 3.14};
        MathBox mb = new MathBox(data);
        double divider = 0.0;
        double[] expRes = {0.50028, 1.57, 6.3337, 17.0, 22.25};
        double[] actRes = mb.splitter(divider);
        assertArrayEquals(expRes, actRes, 0);
    }
}