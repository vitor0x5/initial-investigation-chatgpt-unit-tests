package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest24{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        // Test with positive values
        Item[] v1 = {new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        assertEquals(3, Max.max(v1, 3).chave);

        // Test with negative values
        Item[] v2 = {new MeuItem(-1), new MeuItem(-2), new MeuItem(-3)};
        assertEquals(-1, Max.max(v2, 3).chave);

        // Test with boundary values
        Item[] v3 = {new MeuItem(Integer.MAX_VALUE), new MeuItem(Integer.MIN_VALUE)};
        assertEquals(Integer.MAX_VALUE, Max.max(v3, 2).chave);

        // Test with empty array
        Item[] v4 = {};
        assertNull(Max.max(v4, 0));
    }

    @Test(timeout=1000)
    public void testCompara() throws Exception {
        // Test with true value
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        assertEquals(-1, item1.compara(item2));

        // Test with false value
        MeuItem item3 = new MeuItem(3);
        MeuItem item4 = new MeuItem(2);
        assertEquals(1, item3.compara(item4));

        // Test with boundary values
        MeuItem item5 = new MeuItem(Integer.MAX_VALUE);
        MeuItem item6 = new MeuItem(Integer.MIN_VALUE);
        assertEquals(1, item5.compara(item6));
    }
}