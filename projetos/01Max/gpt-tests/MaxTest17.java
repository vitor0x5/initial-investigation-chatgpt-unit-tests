package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest17{


    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    @Test(timeout = 1000)
    public void testMaxWithPositiveValues() throws Exception {
        Item v[] = { new MeuItem(5), new MeuItem(10), new MeuItem(3) };
        Item max = Max.max(v, 3);
        assertEquals(10, ((MeuItem) max).chave);
    }

    @Test(timeout = 1000)
    public void testMaxWithNegativeValues() throws Exception {
        Item v[] = { new MeuItem(-5), new MeuItem(-10), new MeuItem(-3) };
        Item max = Max.max(v, 3);
        assertEquals(-3, ((MeuItem) max).chave);
    }

    @Test(timeout = 1000)
    public void testMaxWithBoundaryValues() throws Exception {
        Item v[] = { new MeuItem(Integer.MIN_VALUE), new MeuItem(Integer.MAX_VALUE) };
        Item max = Max.max(v, 2);
        assertEquals(Integer.MAX_VALUE, ((MeuItem) max).chave);
    }

    @Test(timeout = 1000)
    public void testMaxWithEmptyArray() throws Exception {
        Item v[] = {};
        Item max = Max.max(v, 0);
        assertNull(max);
    }

    @Test(timeout = 1000)
    public void testMaxWithSingleElementArray() throws Exception {
        Item v[] = { new MeuItem(5) };
        Item max = Max.max(v, 1);
        assertEquals(5, ((MeuItem) max).chave);
    }
}