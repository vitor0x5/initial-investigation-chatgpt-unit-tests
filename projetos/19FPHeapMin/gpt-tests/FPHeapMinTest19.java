package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest19{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        assertEquals(1, min.compara(new MeuItem(1)));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, new Integer(1));
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
        assertEquals(0, heap.min().compara(newItem));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.imprime();
        // No assert statement as it only prints to console
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(3);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(2);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        Item[] copy = new Item[6];
        heap.copia(copy);
        assertEquals(5, copy[1].compara(new MeuItem(5)));
    }
}