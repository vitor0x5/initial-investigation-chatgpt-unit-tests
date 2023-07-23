package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test1{


    @Test
    public void testMaxMin3_withOddLengthArray() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_withEvenLengthArray() {
        int[] v = {5, 4, 3, 2};
        int n = 4;
        int[] expected = {5, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_withAscendingOrderArray() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_withDescendingOrderArray() {
        int[] v = {5, 4, 3, 2, 1};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxMin3_withEqualElementsArray() {
        int[] v = {5, 5, 5, 5};
        int n = 4;
        int[] expected = {5, 5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}