package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test0{


    @Test
    public void testMaxMin3_oddLength() {
        int[] v = {1, 4, 2, 5, 3};
        int n = v.length - 1;

        int[] result = MaxMin3.maxMin3(v, n);

        assertEquals(5, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testMaxMin3_evenLength() {
        int[] v = {4, 2, 5, 3};
        int n = v.length - 1;

        int[] result = MaxMin3.maxMin3(v, n);

        assertEquals(5, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testMaxMin3_singleElement() {
        int[] v = {1};
        int n = v.length - 1;

        int[] result = MaxMin3.maxMin3(v, n);

        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testMaxMin3_noElements() {
        int[] v = {};
        int n = v.length - 1;

        int[] result = MaxMin3.maxMin3(v, n);

        assertEquals(Integer.MIN_VALUE, result[0]);
        assertEquals(Integer.MAX_VALUE, result[1]);
    }
}