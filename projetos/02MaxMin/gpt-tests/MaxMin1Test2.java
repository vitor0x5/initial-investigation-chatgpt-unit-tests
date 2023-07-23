package ds;import org.junit.Assert;
import org.junit.Test;

public class MaxMin1Test2{


    @Test
    public void testMaxMin1_AllPositiveNumbers() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] actual = MaxMin1.maxMin1(v, n);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin1_AllNegativeNumbers() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] actual = MaxMin1.maxMin1(v, n);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin1_PositiveAndNegativeNumbers() {
        int[] v = {-5, 2, -3, 4, -1};
        int n = 5;
        int[] expected = {4, -5};
        int[] actual = MaxMin1.maxMin1(v, n);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin1_SingleNumber() {
        int[] v = {10};
        int n = 1;
        int[] expected = {10, 10};
        int[] actual = MaxMin1.maxMin1(v, n);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxMin1_EmptyArray() {
        int[] v = {};
        int n = 0;
        int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] actual = MaxMin1.maxMin1(v, n);
        Assert.assertArrayEquals(expected, actual);
    }
}