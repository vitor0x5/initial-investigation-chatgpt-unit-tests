package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest8{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testRefaz() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
            heap.copia(v);

            heap.refaz(1, 3);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testConstroi() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
            heap.copia(v);

            heap.constroi();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testMax() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
            heap.copia(v);

            Item max = heap.max();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testRetiraMax() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
            heap.copia(v);

            Item max = heap.retiraMax();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testAumentaChave() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
            heap.copia(v);

            heap.aumentaChave(2, new MeuItem(6));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testInsere() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4)};
            heap.copia(v);

            heap.insere(new MeuItem(5));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testImprime() {
        try {
            FPHeapMax heap = new FPHeapMax(10);
            Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
            heap.copia(v);

            heap.imprime();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}