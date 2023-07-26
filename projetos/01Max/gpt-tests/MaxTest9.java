package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest9{


    // Test for default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    // Test for method max() with valid inputs
    @Test(timeout = 1000)
    public void testMax() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        
        Item result = Max.max(v, 5);
        assertEquals(10, ((MeuItem) result).chave);
    }
    
    // Test for conditional expression true value in method compara()
    @Test(timeout = 1000)
    public void testComparaTrue() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        assertEquals(-1, result);
    }
    
    // Test for conditional expression false value in method compara()
    @Test(timeout = 1000)
    public void testComparaFalse() throws Exception {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        
        int result = item1.compara(item2);
        assertEquals(1, result);
    }
    
    // Test for conditional expression true value and boundary value (negative) in method max()
    @Test(timeout = 1000)
    public void testMaxTrueBoundaryNegative() throws Exception {
        Item[] v = new Item[3];
        v[0] = new MeuItem(-5);
        v[1] = new MeuItem(-10);
        v[2] = new MeuItem(-3);
        
        Item result = Max.max(v, 3);
        assertEquals(-3, ((MeuItem) result).chave);
    }
    
    // Test for conditional expression false value and boundary value (positive) in method max()
    @Test(timeout = 1000)
    public void testMaxFalseBoundaryPositive() throws Exception {
        Item[] v = new Item[4];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(20);
        
        Item result = Max.max(v, 4);
        assertEquals(20, ((MeuItem) result).chave);
    }
}