package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMaxTest21{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)});
        heap.refaz(1, 5);
        assertEquals(5, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)});
        heap.constroi();
        assertEquals(5, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)});
        MeuItem max = (MeuItem) heap.retiraMax();
        assertEquals(5, max.chave);
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)});
        heap.aumentaChave(3, 10);
        assertEquals(10, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)});
        heap.insere(new MeuItem(10));
        assertEquals(10, ((MeuItem) heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testImprime() {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)});
        heap.imprime();
        // assert output
    }
}