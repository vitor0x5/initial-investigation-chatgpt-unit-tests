package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest4{


    @Test(timeout=1000)
    public void testConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        heap.refaz(1, 10);
        // add assertions here
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        heap.constroi();
        // add assertions here
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        Item max = heap.max();
        assertNotNull(max);
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        Item max = heap.retiraMax();
        assertNotNull(max);
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        heap.aumentaChave(1, new Object());
        // add assertions here
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        Item item = new MeuItem(5);
        heap.insere(item);
        // add assertions here
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        heap.copia(items);
        heap.imprime();
        // add assertions here
    }
}