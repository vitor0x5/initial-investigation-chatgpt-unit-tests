package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest4{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    // Test for max() method with valid inputs
    @Test(timeout=1000)
    public void testMaxValidInputs() throws Exception {
        // Test with positive values
        Item[] v1 = {new MeuItem(5), new MeuItem(10), new MeuItem(8)};
        Item max1 = Max.max(v1, v1.length);
        assertEquals(10, ((MeuItem)max1).chave);

        // Test with negative values
        Item[] v2 = {new MeuItem(-5), new MeuItem(-10), new MeuItem(-8)};
        Item max2 = Max.max(v2, v2.length);
        assertEquals(-5, ((MeuItem)max2).chave);

        // Test with both positive and negative values
        Item[] v3 = {new MeuItem(-5), new MeuItem(10), new MeuItem(-8)};
        Item max3 = Max.max(v3, v3.length);
        assertEquals(10, ((MeuItem)max3).chave);
    }

    // Test for max() method with empty array
    @Test(timeout=1000)
    public void testMaxEmptyArray() throws Exception {
        Item[] v = {};
        try {
            Item max = Max.max(v, v.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            fail("Should not throw any exception");
        }
    }

    // Test for max() method with null array
    @Test(timeout=1000)
    public void testMaxNullArray() throws Exception {
        Item[] v = null;
        try {
            Item max = Max.max(v, 5);
        } catch (NullPointerException e) {
            fail("Should not throw any exception");
        }
    }
}