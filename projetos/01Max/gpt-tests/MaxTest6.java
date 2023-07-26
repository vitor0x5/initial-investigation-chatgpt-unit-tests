package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest6{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }
    
    @Test(timeout=1000)
    public void testMax_NullArray() throws Exception {
        Item[] v = null;
        int n = 5;
        
        try {
            Max.max(v, n);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
    
    @Test(timeout=1000)
    public void testMax_EmptyArray() throws Exception {
        Item[] v = new Item[0];
        int n = 0;
        
        try {
            Item max = Max.max(v, n);
            assertNull(max);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getSimpleName());
        }
    }
    
    @Test(timeout=1000)
    public void testMax_OneItem() throws Exception {
        Item[] v = new Item[1];
        v[0] = new MeuItem(10);
        int n = 1;
        
        try {
            Item max = Max.max(v, n);
            assertEquals(v[0], max);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getSimpleName());
        }
    }
    
    @Test(timeout=1000)
    public void testMax_MultipleItems() throws Exception {
        Item[] v = new Item[5];
        v[0] = new MeuItem(10);
        v[1] = new MeuItem(-5);
        v[2] = new MeuItem(20);
        v[3] = new MeuItem(0);
        v[4] = new MeuItem(15);
        int n = 5;
        
        try {
            Item max = Max.max(v, n);
            assertEquals(v[2], max);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getSimpleName());
        }
    }
    
    @Test(timeout=1000)
    public void testCompara_LessThan() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(10);
        
        try {
            int result = item1.compara(item2);
            assertEquals(-1, result);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getSimpleName());
        }
    }
    
    @Test(timeout=1000)
    public void testCompara_GreaterThan() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(5);
        
        try {
            int result = item1.compara(item2);
            assertEquals(1, result);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getSimpleName());
        }
    }
    
    @Test(timeout=1000)
    public void testCompara_Equal() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(10);
        
        try {
            int result = item1.compara(item2);
            assertEquals(0, result);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getSimpleName());
        }
    }
    
    @Test(timeout=1000)
    public void testCompara_NullItem() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = null;
        
        try {
            int result = item1.compara(item2);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}