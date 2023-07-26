package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest17{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7), new MeuItem(1)});
        heap.refaz(1, 6);

        assertEquals(new MeuItem(8), heap.max());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7), new MeuItem(1)});
        heap.constroi();

        assertEquals(new MeuItem(8), heap.max());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7), new MeuItem(1)});

        assertEquals(new MeuItem(8), heap.retiraMax());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7), new MeuItem(1)});
        heap.aumentaChave(3, new MeuItem(10));

        assertEquals(new MeuItem(10), heap.max());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7), new MeuItem(1)});
        heap.insere(new MeuItem(10));

        assertEquals(new MeuItem(10), heap.max());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7), new MeuItem(1)});

        heap.imprime();
    }
}