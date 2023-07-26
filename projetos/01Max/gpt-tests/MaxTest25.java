package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest25{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    // Test for max method with valid inputs
    @Test(timeout=1000)
    public void testMaxValidInputs() throws Exception {
        Item[] items = new Item[3];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(3);

        Item maxItem = Max.max(items, 3);
        assertEquals(10, ((MeuItem)maxItem).chave);
    }

    // Test for max method with empty array
    @Test(timeout=1000)
    public void testMaxEmptyArray() throws Exception {
        Item[] items = new Item[0];

        Item maxItem = Max.max(items, 0);
        assertNull(maxItem);
    }

    // Test for max method with negative values
    @Test(timeout=1000)
    public void testMaxNegativeValues() throws Exception {
        Item[] items = new Item[4];
        items[0] = new MeuItem(-5);
        items[1] = new MeuItem(-10);
        items[2] = new MeuItem(-3);
        items[3] = new MeuItem(-7);

        Item maxItem = Max.max(items, 4);
        assertEquals(-3, ((MeuItem)maxItem).chave);
    }

    // Test for max method with boundary values
    @Test(timeout=1000)
    public void testMaxBoundaryValues() throws Exception {
        Item[] items = new Item[5];
        items[0] = new MeuItem(Integer.MIN_VALUE);
        items[1] = new MeuItem(Integer.MAX_VALUE);
        items[2] = new MeuItem(0);
        items[3] = new MeuItem(-100);
        items[4] = new MeuItem(100);

        Item maxItem = Max.max(items, 5);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)maxItem).chave);
    }
}