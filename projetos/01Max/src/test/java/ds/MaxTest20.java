package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(10);
        v[1] = new MeuItem(20);
        v[2] = new MeuItem(30);
        v[3] = new MeuItem(40);
        v[4] = new MeuItem(50);
        
        Item result = Max.max(v, 5);
        assertEquals(50, ((MeuItem)result).chave);
    }

    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(-10);
        v[1] = new MeuItem(-20);
        v[2] = new MeuItem(-30);
        v[3] = new MeuItem(-40);
        v[4] = new MeuItem(-50);
        
        Item result = Max.max(v, 5);
        assertEquals(-10, ((MeuItem)result).chave);
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
}