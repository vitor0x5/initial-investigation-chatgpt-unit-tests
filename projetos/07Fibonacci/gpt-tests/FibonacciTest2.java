package ds;package ds;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest2{


    @Test
    public void testFibIterWithInput0() {
        int result = Fibonacci.fibIter(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testFibIterWithInput1() {
        int result = Fibonacci.fibIter(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testFibIterWithInput5() {
        int result = Fibonacci.fibIter(5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testFibIterWithInput10() {
        int result = Fibonacci.fibIter(10);
        Assert.assertEquals(55, result);
    }
}