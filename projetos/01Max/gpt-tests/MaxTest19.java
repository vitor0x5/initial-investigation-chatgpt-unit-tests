package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest19{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    // Test for max method with valid inputs
    @Test(timeout=1000)
    public void testMaxValidInputs() throws Exception {
        Item[] v = new Item[3];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(3);
        Item max = Max.max(v, 3);
        assertEquals(10, ((MeuItem)max).chave);
    }

    // Test for max method with empty array
    @Test(timeout=1000)
    public void testMaxEmptyArray() throws Exception {
        Item[] v = new Item[0];
        Item max = Max.max(v, 0);
        assertNull(max);
    }

    // Test for max method with array of size 1
    @Test(timeout=1000)
    public void testMaxArraySize1() throws Exception {
        Item[] v = new Item[1];
        v[0] = new MeuItem(5);
        Item max = Max.max(v, 1);
        assertEquals(5, ((MeuItem)max).chave);
    }

    // Test for max method with negative values
    @Test(timeout=1000)
    public void testMaxNegativeValues() throws Exception {
        Item[] v = new Item[3];
        v[0] = new MeuItem(-5);
        v[1] = new MeuItem(-10);
        v[2] = new MeuItem(-3);
        Item max = Max.max(v, 3);
        assertEquals(-3, ((MeuItem)max).chave);
    }

    // Test for max method with boundary values
    @Test(timeout=1000)
    public void testMaxBoundaryValues() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(Integer.MIN_VALUE);
        v[1] = new MeuItem(Integer.MAX_VALUE);
        v[2] = new MeuItem(0);
        v[3] = new MeuItem(100);
        v[4] = new MeuItem(-100);
        Item max = Max.max(v, 5);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)max).chave);
    }
}