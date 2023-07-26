package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test4{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
        assertNotNull(maxMin2);
    }

    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {5, -4};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithEmptyArray() throws Exception {
        int[] v = {};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {0, 0};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithSingleElement() throws Exception {
        int[] v = {1};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {1, 1};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithAllPositiveValues() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {5, 1};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithAllNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {-1, -5};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithDuplicateMaxValue() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 5};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {5, 1};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithDuplicateMinValue() throws Exception {
        int[] v = {1, 2, 3, 4, 4, 5};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {5, 1};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithMaxAndMinValuesSwapped() throws Exception {
        int[] v = {5, -4, 3, -2, 1};
        int[] result = MaxMin2.maxMin2(v, v.length);

        int[] expected = {5, -4};
        assertArrayEquals(expected, result);
    }
}