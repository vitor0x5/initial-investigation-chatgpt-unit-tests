package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest1{

    
    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }
    
    // Test for the max method with valid inputs
    @Test(timeout=1000)
    public void testMax_ValidInput() throws Exception {
        Item[] items = new Item[] { new MeuItem(5), new MeuItem(10), new MeuItem(2) };
        Item maxItem = Max.max(items, 3);
        assertEquals(10, ((MeuItem)maxItem).chave);
    }
    
    // Test for the max method with an empty array
    @Test(timeout=1000)
    public void testMax_EmptyArray() throws Exception {
        Item[] items = new Item[0];
        Item maxItem = Max.max(items, 0);
        assertNull(maxItem);
    }
    
    // Test for the max method with a single item
    @Test(timeout=1000)
    public void testMax_SingleItem() throws Exception {
        Item[] items = new Item[] { new MeuItem(5) };
        Item maxItem = Max.max(items, 1);
        assertEquals(5, ((MeuItem)maxItem).chave);
    }
    
    // Test for the max method with negative values
    @Test(timeout=1000)
    public void testMax_NegativeValues() throws Exception {
        Item[] items = new Item[] { new MeuItem(-5), new MeuItem(-10), new MeuItem(-2) };
        Item maxItem = Max.max(items, 3);
        assertEquals(-2, ((MeuItem)maxItem).chave);
    }
    
    // Test for the compara method with this.chave < item.chave
    @Test(timeout=1000)
    public void testCompara_LessThan() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(10);
        int result = item1.compara(item2);
        assertEquals(-1, result);
    }
    
    // Test for the compara method with this.chave > item.chave
    @Test(timeout=1000)
    public void testCompara_GreaterThan() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(5);
        int result = item1.compara(item2);
        assertEquals(1, result);
    }
    
    // Test for the compara method with this.chave = item.chave
    @Test(timeout=1000)
    public void testCompara_Equals() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(5);
        int result = item1.compara(item2);
        assertEquals(0, result);
    }
}