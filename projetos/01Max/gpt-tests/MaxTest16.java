package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest16{


    // Test for default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    // Test for max method with valid inputs
    @Test(timeout = 1000)
    public void testMaxValidInputs() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(10), new MeuItem(3)};
        Item maxItem = Max.max(items, 3);
        assertEquals(10, ((MeuItem) maxItem).chave);
    }

    // Test for max method with empty array
    @Test(timeout = 1000)
    public void testMaxEmptyArray() throws Exception {
        Item[] items = {};
        Item maxItem = Max.max(items, 0);
        assertNull(maxItem);
    }

    // Test for max method with single item
    @Test(timeout = 1000)
    public void testMaxSingleItem() throws Exception {
        Item[] items = {new MeuItem(5)};
        Item maxItem = Max.max(items, 1);
        assertEquals(5, ((MeuItem) maxItem).chave);
    }

    // Test for max method with negative values
    @Test(timeout = 1000)
    public void testMaxNegativeValues() throws Exception {
        Item[] items = {new MeuItem(-5), new MeuItem(-10), new MeuItem(-3)};
        Item maxItem = Max.max(items, 3);
        assertEquals(-3, ((MeuItem) maxItem).chave);
    }

    // Test for max method with boundary values
    @Test(timeout = 1000)
    public void testMaxBoundaryValues() throws Exception {
        Item[] items = {new MeuItem(Integer.MIN_VALUE), new MeuItem(Integer.MAX_VALUE)};
        Item maxItem = Max.max(items, 2);
        assertEquals(Integer.MAX_VALUE, ((MeuItem) maxItem).chave);
    }
}