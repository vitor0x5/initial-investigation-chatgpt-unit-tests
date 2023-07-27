package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test6{


    @Test( timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 mm = new MaxMin2();
    }

    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};

        int[] result = MaxMin2.maxMin2(v, n);

        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = v.length;
        int[] expected = {-1, -5};

        int[] result = MaxMin2.maxMin2(v, n);

        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithDuplicates() throws Exception {
        int[] v = {5, 2, 3, 5, 1};
        int n = v.length;
        int[] expected = {5, 1};

        int[] result = MaxMin2.maxMin2(v, n);

        assertArrayEquals(expected, result);
    }
}