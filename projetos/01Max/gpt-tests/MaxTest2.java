package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MaxTest2{

    
    private Max max;
    private Item[] items;
    
    @Before
    public void setUp() {
        max = new Max();
        items = new Item[5];
        items[0] = new MeuItem(10);
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(15);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(3);
    }
    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        assertNotNull(max);
    }
    
    @Test(timeout=1000)
    public void testMaxWithPositiveValues() throws Exception {
        Item result = max.max(items, 5);
        assertEquals(15, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        items[0] = new MeuItem(-10);
        items[1] = new MeuItem(-5);
        items[2] = new MeuItem(-15);
        items[3] = new MeuItem(-7);
        items[4] = new MeuItem(-3);
        Item result = max.max(items, 5);
        assertEquals(-3, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithEqualValues() throws Exception {
        items[0] = new MeuItem(10);
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(10);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(10);
        Item result = max.max(items, 5);
        assertEquals(10, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithBoundaryValues() throws Exception {
        items[0] = new MeuItem(Integer.MAX_VALUE);
        items[1] = new MeuItem(Integer.MIN_VALUE);
        Item result = max.max(items, 2);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)result).chave);
    }
}