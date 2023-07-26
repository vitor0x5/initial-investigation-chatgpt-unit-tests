package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest28{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7)});
        heap.refaz(1, 5);
        assertEquals(8, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7)});
        heap.constroi();
        assertEquals(8, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7)});
        MeuItem max = (MeuItem) heap.retiraMax();
        assertEquals(8, max.chave);
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7)});
        heap.aumentaChave(2, 10);
        assertEquals(10, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7)});
        heap.insere(new MeuItem(10));
        assertEquals(10, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(7)});
        heap.imprime();
    }
}