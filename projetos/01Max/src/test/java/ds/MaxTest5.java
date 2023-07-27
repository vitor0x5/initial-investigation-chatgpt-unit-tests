package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest5{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        // Create an instance of the class under test
        Max max = new Max();
        
        // Assert that the instance is not null
        assertNotNull(max);
    }

    // Test for the max method
    @Test(timeout=1000)
    public void testMax() throws Exception {
        // Create an array of Item objects
        Item[] items = new Item[4];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        
        // Call the max method
        Item result = Max.max(items, 4);
        
        // Assert that the expected item with the maximum value is returned
        assertEquals(10, ((MeuItem) result).chave);
    }

    // Test for the compara method with true value
    @Test(timeout=1000)
    public void testComparaTrue() throws Exception {
        // Create two instances of the class under test
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(3);
        
        // Call the compara method with true value
        int result = item1.compara(item2);
        
        // Assert that the expected value is returned
        assertEquals(1, result);
    }

    // Test for the compara method with false value
    @Test(timeout=1000)
    public void testComparaFalse() throws Exception {
        // Create two instances of the class under test
        MeuItem item1 = new MeuItem(3);
        MeuItem item2 = new MeuItem(5);
        
        // Call the compara method with false value
        int result = item1.compara(item2);
        
        // Assert that the expected value is returned
        assertEquals(-1, result);
    }
}