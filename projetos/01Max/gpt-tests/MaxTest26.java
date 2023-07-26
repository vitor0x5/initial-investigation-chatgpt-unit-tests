package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest26{

    
    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }
    
    // Test for max method with valid inputs
    @Test(timeout=1000)
    public void testMaxWithValidInputs() throws Exception {
        Item[] items = new Item[5];
        items[0] = new MeuItem(10);
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(15);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(12);
        
        Item result = Max.max(items, 5);
        assertEquals(15, ((MeuItem)result).chave);
    }
    
    // Test for max method with empty array
    @Test(timeout=1000)
    public void testMaxWithEmptyArray() throws Exception {
        Item[] items = new Item[0];
        
        Item result = Max.max(items, 0);
        assertNull(result);
    }
    
    // Test for max method with negative values
    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item[] items = new Item[5];
        items[0] = new MeuItem(-10);
        items[1] = new MeuItem(-5);
        items[2] = new MeuItem(-15);
        items[3] = new MeuItem(-8);
        items[4] = new MeuItem(-12);
        
        Item result = Max.max(items, 5);
        assertEquals(-5, ((MeuItem)result).chave);
    }
    
    // Test for max method with boundary values
    @Test(timeout=1000)
    public void testMaxWithBoundaryValues() throws Exception {
        Item[] items = new Item[5];
        items[0] = new MeuItem(Integer.MIN_VALUE);
        items[1] = new MeuItem(Integer.MAX_VALUE);
        items[2] = new MeuItem(0);
        items[3] = new MeuItem(-100);
        items[4] = new MeuItem(100);
        
        Item result = Max.max(items, 5);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)result).chave);
    }
    
    // Test for compara method with valid inputs
    @Test(timeout=1000)
    public void testComparaWithValidInputs() throws Exception {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        
        int result = item1.compara(item2);
        assertEquals(1, result);
    }
    
    // Test for compara method with equal values
    @Test(timeout=1000)
    public void testComparaWithEqualValues() throws Exception {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(10);
        
        int result = item1.compara(item2);
        assertEquals(0, result);
    }
    
    // Test for compara method with negative values
    @Test(timeout=1000)
    public void testComparaWithNegativeValues() throws Exception {
        Item item1 = new MeuItem(-10);
        Item item2 = new MeuItem(-5);
        
        int result = item1.compara(item2);
        assertEquals(-1, result);
    }
}