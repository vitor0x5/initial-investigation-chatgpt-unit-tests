package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    @Test(timeout=1000)
    public void testMaxWithPositiveValues() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(10), new MeuItem(3)};
        Item maxItem = Max.max(items, items.length);
        assertEquals(10, ((MeuItem)maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item[] items = {new MeuItem(-5), new MeuItem(-10), new MeuItem(-3)};
        Item maxItem = Max.max(items, items.length);
        assertEquals(-3, ((MeuItem)maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithMixedValues() throws Exception {
        Item[] items = {new MeuItem(-5), new MeuItem(10), new MeuItem(0)};
        Item maxItem = Max.max(items, items.length);
        assertEquals(10, ((MeuItem)maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithBoundaryValues() throws Exception {
        Item[] items = {new MeuItem(Integer.MIN_VALUE), new MeuItem(Integer.MAX_VALUE)};
        Item maxItem = Max.max(items, items.length);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithEmptyArray() throws Exception {
        Item[] items = {};
        Item maxItem = Max.max(items, items.length);
        assertNull(maxItem);
    }
}