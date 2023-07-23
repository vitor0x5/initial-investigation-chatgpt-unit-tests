package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test2{


    @Test
    public void testMaxMin2() {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithNegativeNumbers() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = v.length;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithDuplicateValues() {
        int[] v = {2, 2, 2, 2, 2};
        int n = v.length;
        int[] expected = {2, 2};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithSingleValue() {
        int[] v = {7};
        int n = v.length;
        int[] expected = {7, 7};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test
    public void testMaxMin2WithEmptyArray() {
        int[] v = {};
        int n = v.length;
        int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }
}