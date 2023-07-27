package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest27{


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
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(12);
        
        Item result = Max.max(v, 5);
        assertEquals(15, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(-10);
        v[1] = new MeuItem(-5);
        v[2] = new MeuItem(-15);
        v[3] = new MeuItem(-8);
        v[4] = new MeuItem(-12);
        
        Item result = Max.max(v, 5);
        assertEquals(-5, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithBoundaryValues() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(Integer.MIN_VALUE);
        v[1] = new MeuItem(Integer.MAX_VALUE);
        v[2] = new MeuItem(0);
        v[3] = new MeuItem(-100);
        v[4] = new MeuItem(100);
        
        Item result = Max.max(v, 5);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testCompara() throws Exception {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        
        int result = item1.compara(item2);
        assertEquals(1, result);
    }
}