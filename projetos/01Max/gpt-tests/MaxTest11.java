package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest11{


    @Test(expected = Exception.class)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    @Test(timeout = 1000)
    public void testMax() throws Exception {
        // Test with array of size 0
        Item[] emptyArray = {};
        assertNull(Max.max(emptyArray, 0));

        // Test with array of size 1
        Item[] arraySize1 = {new MeuItem(5)};
        assertEquals(5, Max.max(arraySize1, 1).chave);

        // Test with array of size 2
        Item[] arraySize2 = {new MeuItem(10), new MeuItem(15)};
        assertEquals(15, Max.max(arraySize2, 2).chave);
        assertEquals(10, Max.max(arraySize2, 2).chave);
    }

    @Test(timeout = 1000)
    public void testCompara() throws Exception {
        // Test when this.chave < item.chave
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(10);
        assertEquals(-1, item1.compara(item2));

        // Test when this.chave > item.chave
        MeuItem item3 = new MeuItem(20);
        MeuItem item4 = new MeuItem(15);
        assertEquals(1, item3.compara(item4));

        // Test when this.chave = item.chave
        MeuItem item5 = new MeuItem(10);
        MeuItem item6 = new MeuItem(10);
        assertEquals(0, item5.compara(item6));
    }
}