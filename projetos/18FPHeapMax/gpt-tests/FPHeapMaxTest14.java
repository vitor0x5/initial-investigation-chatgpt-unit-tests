package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMaxTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        heap.refaz(1, 4);
        assertEquals(4, ((MeuItem)heap.v[1]).chave);
        assertEquals(3, ((MeuItem)heap.v[2]).chave);
        assertEquals(2, ((MeuItem)heap.v[3]).chave);
        assertEquals(1, ((MeuItem)heap.v[4]).chave);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        heap.constroi();
        assertEquals(4, ((MeuItem)heap.v[1]).chave);
        assertEquals(3, ((MeuItem)heap.v[2]).chave);
        assertEquals(2, ((MeuItem)heap.v[3]).chave);
        assertEquals(1, ((MeuItem)heap.v[4]).chave);
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        assertEquals(4, ((MeuItem)heap.max()).chave);
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        MeuItem max = (MeuItem) heap.retiraMax();
        assertEquals(4, max.chave);
        assertEquals(3, ((MeuItem)heap.v[1]).chave);
        assertEquals(2, ((MeuItem)heap.v[2]).chave);
        assertEquals(1, ((MeuItem)heap.v[3]).chave);
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        heap.aumentaChave(2, 5);
        assertEquals(5, ((MeuItem)heap.v[2]).chave);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        heap.insere(new MeuItem(5));
        assertEquals(5, ((MeuItem)heap.v[5]).chave);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(2), new MeuItem(4), new MeuItem(1), new MeuItem(3)});
        heap.imprime();
        // Assertion for printed output can be added here
    }
}