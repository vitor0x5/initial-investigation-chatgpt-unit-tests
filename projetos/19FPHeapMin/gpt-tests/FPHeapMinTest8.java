package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest8{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        FPHeapMin heap = new FPHeapMin(10);
    }

    @Test(timeout = 1000)
    public void testRefaz() {
        Item[] items = new Item[6];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(4);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testConstroi() {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMinEmptyHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.retiraMin();
    }

    @Test(timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, 0);
        assertEquals(0, heap.min().recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChaveNullChaveNova() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(1);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, null);
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        Item item = new MeuItem(5);
        heap.insere(item);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereFullHeap() throws Exception {
        Item[] items = new Item[1];
        items[0] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        Item item = new MeuItem(10);
        heap.insere(item);
    }
}