package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test0{


    @Test(expected = Exception.class)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
    }

    @Test(timeout = 1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4WithEmptyArray() throws Exception {
        int[] v = {};
        int linf = 0;
        int lsup = 4;
        int[] expected = {0, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4WithSingleElement() throws Exception {
        int[] v = {5};
        int linf = 0;
        int lsup = 0;
        int[] expected = {5, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4WithTwoElementsAscendingOrder() throws Exception {
        int[] v = {1, 2};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4WithTwoElementsDescendingOrder() throws Exception {
        int[] v = {2, 1};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4WithThreeElementsAscendingOrder() throws Exception {
        int[] v = {1, 2, 3};
        int linf = 0;
        int lsup = 2;
        int[] expected = {3, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4WithThreeElementsDescendingOrder() throws Exception {
        int[] v = {3, 2, 1};
        int linf = 0;
        int lsup = 2;
        int[] expected = {3, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}