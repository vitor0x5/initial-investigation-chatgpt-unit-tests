package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMaxTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] v = new Item[11];
        for (int i = 1; i <= 10; i++) {
            v[i] = new MeuItem(i);
        }
        heap.copia(v);
        heap.refaz(1, 10);
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] v = new Item[11];
        for (int i = 1; i <= 10; i++) {
            v[i] = new MeuItem(i);
        }
        heap.copia(v);
        heap.constroi();
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] v = new Item[11];
        for (int i = 1; i <= 10; i++) {
            v[i] = new MeuItem(i);
        }
        heap.copia(v);
        Item max = heap.retiraMax();
        assertEquals(10, max.recuperaChave());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] v = new Item[11];
        for (int i = 1; i <= 10; i++) {
            v[i] = new MeuItem(i);
        }
        heap.copia(v);
        heap.aumentaChave(1, 20);
        assertEquals(20, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] v = new Item[11];
        for (int i = 1; i <= 10; i++) {
            v[i] = new MeuItem(i);
        }
        heap.copia(v);
        Item newItem = new MeuItem(11);
        heap.insere(newItem);
        assertEquals(11, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] v = new Item[11];
        for (int i = 1; i <= 10; i++) {
            v[i] = new MeuItem(i);
        }
        heap.copia(v);
        heap.imprime();
    }
}