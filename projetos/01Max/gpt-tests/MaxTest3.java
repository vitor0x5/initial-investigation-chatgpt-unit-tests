package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.rules.Timeout;

public class MaxTest3{

    
    @Test(expected=ClassCastException.class, timeout=1000)
    public void testMaxWithInvalidDataType() throws Exception {
        Item[] v = { new MeuItem(10), new MeuItem(20), new MeuItem(30) };
        Max.max(v, 3);
    }
    
    @Test(timeout=1000)
    public void testMaxWithValidInput() throws Exception {
        Item[] v = { new MeuItem(10), new MeuItem(20), new MeuItem(30) };
        Item result = Max.max(v, 3);
        assertEquals(30, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithEmptyArray() throws Exception {
        Item[] v = {};
        Item result = Max.max(v, 0);
        assertNull(result);
    }
    
    @Test(timeout=1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item[] v = { new MeuItem(-10), new MeuItem(-20), new MeuItem(-30) };
        Item result = Max.max(v, 3);
        assertEquals(-10, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithBoundaryValues() throws Exception {
        Item[] v = { new MeuItem(Integer.MIN_VALUE), new MeuItem(Integer.MAX_VALUE), new MeuItem(0) };
        Item result = Max.max(v, 3);
        assertEquals(Integer.MAX_VALUE, ((MeuItem)result).chave);
    }
    
    @Test(expected=ArrayIndexOutOfBoundsException.class, timeout=1000)
    public void testMaxWithInvalidArraySize() throws Exception {
        Item[] v = { new MeuItem(10), new MeuItem(20), new MeuItem(30) };
        Max.max(v, 5);
    }
    
    @Test(timeout=1000)
    public void testMaxWithEqualValues() throws Exception {
        Item[] v = { new MeuItem(10), new MeuItem(10), new MeuItem(10) };
        Item result = Max.max(v, 3);
        assertEquals(10, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithSingleValue() throws Exception {
        Item[] v = { new MeuItem(10) };
        Item result = Max.max(v, 1);
        assertEquals(10, ((MeuItem)result).chave);
    }
    
    @Test(timeout=1000)
    public void testMaxWithNullArray() throws Exception {
        Item[] v = null;
        Item result = Max.max(v, 0);
        assertNull(result);
    }
    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }
}