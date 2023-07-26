package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test2{


    @Test(expected=IndexOutOfBoundsException.class, timeout=1000)
    public void testDefaultConstructor() {
        MaxMin1 maxMin1 = new MaxMin1();
    }

    @Test(expected=IndexOutOfBoundsException.class, timeout=1000)
    public void testMaxMin1() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] maxMin = MaxMin1.maxMin1(v, n);
        assertEquals(5, maxMin[0]);
        assertEquals(1, maxMin[1]);
    }

    @Test(expected=IndexOutOfBoundsException.class, timeout=1000)
    public void testMaxMin1WithNegativeValues() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] maxMin = MaxMin1.maxMin1(v, n);
        assertEquals(-1, maxMin[0]);
        assertEquals(-5, maxMin[1]);
    }

    @Test(expected=IndexOutOfBoundsException.class, timeout=1000)
    public void testMaxMin1WithBoundaryValues() {
        int[] v = {0, 100, 200, 300, 400};
        int n = 5;
        int[] maxMin = MaxMin1.maxMin1(v, n);
        assertEquals(400, maxMin[0]);
        assertEquals(0, maxMin[1]);
    }
}