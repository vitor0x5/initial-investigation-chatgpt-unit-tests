package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest15{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    // Test for max method with valid inputs
    @Test(timeout=1000)
    public void testMaxValidInputs() throws Exception {
        Item[] v = {new MeuItem(5), new MeuItem(10), new MeuItem(3)};
        Item result = Max.max(v, 3);
        assertEquals(10, ((MeuItem)result).chave);
    }

    // Test for max method with empty array
    @Test(timeout=1000)
    public void testMaxEmptyArray() throws Exception {
        Item[] v = {};
        Item result = Max.max(v, 0);
        assertNull(result);
    }

    // Test for max method with array of size 1
    @Test(timeout=1000)
    public void testMaxArraySize1() throws Exception {
        Item[] v = {new MeuItem(5)};
        Item result = Max.max(v, 1);
        assertEquals(5, ((MeuItem)result).chave);
    }

    // Test for max method with array of size 2
    @Test(timeout=1000)
    public void testMaxArraySize2() throws Exception {
        Item[] v = {new MeuItem(5), new MeuItem(10)};
        Item result = Max.max(v, 2);
        assertEquals(10, ((MeuItem)result).chave);
    }

    // Test for max method with array of size 3
    @Test(timeout=1000)
    public void testMaxArraySize3() throws Exception {
        Item[] v = {new MeuItem(5), new MeuItem(10), new MeuItem(3)};
        Item result = Max.max(v, 3);
        assertEquals(10, ((MeuItem)result).chave);
    }
}