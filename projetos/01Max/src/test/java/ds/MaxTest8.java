package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
        assertNotNull(max);
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        Item[] v1 = {new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        assertEquals(v1[2], Max.max(v1, 3));

        Item[] v2 = {new MeuItem(5), new MeuItem(3), new MeuItem(8)};
        assertEquals(v2[2], Max.max(v2, 3));

        Item[] v3 = {new MeuItem(10), new MeuItem(8), new MeuItem(12)};
        assertEquals(v3[2], Max.max(v3, 3));
    }

    @Test(timeout=1000)
    public void testCompara() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);

        assertEquals(-1, item1.compara(item2));
        assertEquals(1, item2.compara(item1));

        Item item3 = new MeuItem(15);
        Item item4 = new MeuItem(15);

        assertEquals(0, item3.compara(item4));
        assertEquals(0, item4.compara(item3));
    }
}