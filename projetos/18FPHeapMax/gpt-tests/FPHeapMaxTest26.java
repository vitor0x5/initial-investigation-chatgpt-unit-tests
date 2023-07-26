package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest26{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.refaz(1, 10);
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.constroi();
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(10, max.recuperaChave());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.aumentaChave(5, 15);
        assertEquals(15, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        Item newItem = new MeuItem(15);
        heap.insere(newItem);
        assertEquals(15, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        for (int i = 1; i <= 10; i++) {
            items[i] = new MeuItem(i);
        }
        heap.copia(items);
        heap.imprime();
    }
}