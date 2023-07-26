package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import ds.MeuItem;
import ds.Max;

public class MaxTest10{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        try {
            Max max = new Max();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testMax_withPositiveValues() {
        try {
            MeuItem[] v = new MeuItem[5];
            v[0] = new MeuItem(5);
            v[1] = new MeuItem(3);
            v[2] = new MeuItem(9);
            v[3] = new MeuItem(2);
            v[4] = new MeuItem(8);

            Item maxItem = Max.max(v, 5);
            assertEquals(9, ((MeuItem)maxItem).chave);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testMax_withNegativeValues() {
        try {
            MeuItem[] v = new MeuItem[5];
            v[0] = new MeuItem(-5);
            v[1] = new MeuItem(-3);
            v[2] = new MeuItem(-9);
            v[3] = new MeuItem(-2);
            v[4] = new MeuItem(-8);

            Item maxItem = Max.max(v, 5);
            assertEquals(-2, ((MeuItem)maxItem).chave);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testMax_withBoundaryValues() {
        try {
            MeuItem[] v = new MeuItem[5];
            v[0] = new MeuItem(0);
            v[1] = new MeuItem(Integer.MAX_VALUE);
            v[2] = new MeuItem(Integer.MIN_VALUE);
            v[3] = new MeuItem(100);
            v[4] = new MeuItem(-100);

            Item maxItem = Max.max(v, 5);
            assertEquals(Integer.MAX_VALUE, ((MeuItem)maxItem).chave);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}