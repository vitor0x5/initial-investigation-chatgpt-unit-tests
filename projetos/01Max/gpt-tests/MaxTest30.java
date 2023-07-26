package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest30{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(10);
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(15);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(8);
        
        Item result = Max.max(v, 5);
        assertEquals(15, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithEmptyArray() throws Exception {
        Item[] v = new Item[0];
        
        Item result = Max.max(v, 0);
        assertNull(result);
    }

    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(-10);
        v[1] = new MeuItem(-5);
        v[2] = new MeuItem(-15);
        v[3] = new MeuItem(-3);
        v[4] = new MeuItem(-8);
        
        Item result = Max.max(v, 5);
        assertEquals(-3, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithBoundaryValues() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(Integer.MIN_VALUE);
        v[1] = new MeuItem(Integer.MAX_VALUE);
        v[2] = new MeuItem(0);
        v[3] = new MeuItem(-1);
        v[4] = new MeuItem(1);
        
        Item result = Max.max(v, 5);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testComparaWithEqualItems() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void testComparaWithItem1LessThanItem2() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        assertEquals(-1, result);
    }

    @Test(timeout=1000)
    public void testComparaWithItem1GreaterThanItem2() throws Exception {
        MeuItem item1 = new MeuItem(15);
        MeuItem item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        assertEquals(1, result);
    }
}