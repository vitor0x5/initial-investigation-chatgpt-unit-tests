package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest15{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        heap.refaz(1, 2);

        assertEquals(3, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        heap.constroi();

        assertEquals(3, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        Item min = heap.retiraMin();

        assertEquals(3, min.recuperaChave());
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        heap.diminuiChave(2, 2);

        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        heap.insere(new MeuItem(2));

        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        heap.imprime();
    }

    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item[] items = {new MeuItem(5), new MeuItem(3), new MeuItem(7)};
        FPHeapMin heap = new FPHeapMin(items);

        Item[] newItems = {new MeuItem(2), new MeuItem(4)};
        heap.copia(newItems);

        assertEquals(5, heap.min().recuperaChave());
        assertEquals(2, heap.min().recuperaChave());
    }
}