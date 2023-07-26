package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(10);
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(15);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(12);
        
        Item result = Max.max(v, 5);
        
        assertEquals(15, result.chave);
    }

    @Test(timeout=1000)
    public void testComparaLessThan() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        
        assertEquals(-1, result);
    }

    @Test(timeout=1000)
    public void testComparaGreaterThan() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(5);
        
        int result = item1.compara(item2);
        
        assertEquals(1, result);
    }

    @Test(timeout=1000)
    public void testComparaEquals() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        
        assertEquals(0, result);
    }
}