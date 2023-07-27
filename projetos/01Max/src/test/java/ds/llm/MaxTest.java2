package ds.llm;

import org.junit.Test;
import org.junit.Before;
import ds.Max;
import ds.Item;
import ds.MeuItem;
import static org.junit.Assert.*;

public class MaxTest {
    MeuItem[] items;

    @Before
    public void setUp() throws Exception {
        items = new MeuItem[5];
    }

    @Test(timeout=1000)
    public void testMaxItemWithPositiveValues() throws Exception {
        items[0] = new MeuItem(4);
        items[1] = new MeuItem(7);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(9);
        items[4] = new MeuItem(5);
        Item maxItem = Max.max(items, 5);
        assertEquals(9, ((MeuItem) maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxItemWithNegativeValues() throws Exception {
        items[0] = new MeuItem(-4);
        items[1] = new MeuItem(-7);
        items[2] = new MeuItem(-2);
        items[3] = new MeuItem(-9);
        items[4] = new MeuItem(-5);
        Item maxItem = Max.max(items, 5);
        assertEquals(-2, ((MeuItem) maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxItemWithMixedValues() throws Exception {
        items[0] = new MeuItem(-4);
        items[1] = new MeuItem(7);
        items[2] = new MeuItem(-2);
        items[3] = new MeuItem(9);
        items[4] = new MeuItem(-5);
        Item maxItem = Max.max(items, 5);
        assertEquals(9, ((MeuItem) maxItem).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithEmptyArray() throws Exception {
        Item maxItem = Max.max(items, 0);
    }

    @Test(timeout=1000)
    public void testComparaWithEqualValues() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(5);
        assertEquals(0, item1.compara(item2));
    }

    @Test(timeout=1000)
    public void testComparaWithItem1LessThanItem2() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(10);
        assertEquals(-1, item1.compara(item2));
    }

    @Test(timeout=1000)
    public void testComparaWithItem1GreaterThanItem2() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(5);
        assertEquals(1, item1.compara(item2));
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max maxObject = new Max();
        assertNotNull(maxObject);
    }

}
