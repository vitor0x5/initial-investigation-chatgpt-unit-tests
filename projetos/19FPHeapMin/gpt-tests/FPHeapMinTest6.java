package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class FPHeapMinTest6{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] items = { new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
        assertEquals("1 2 3 4 5 ", heap.toString());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] items = { new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        assertEquals("1 2 3 5 4 ", heap.toString());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMin() throws Exception {
        Item[] items = { new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.min();
        assertEquals(1, min.recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items1 = { new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap1 = new FPHeapMin(items1);
        Item min1 = heap1.retiraMin();
        assertEquals(1, min1.recuperaChave());

        Item[] items2 = { new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap2 = new FPHeapMin(items2);
        Item min2 = heap2.retiraMin();
        assertEquals(1, min2.recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = { new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, 0);
        assertEquals("0 2 3 5 4 ", heap.toString());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Item[] items = { new MeuItem(4), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap = new FPHeapMin(items);
        Item newItem = new MeuItem(3);
        heap.insere(newItem);
        assertEquals("1 2 3 4 ", heap.toString());
    }

    @Test(timeout = 1000)
    public void testImprime() {
        Item[] items = { new MeuItem(5), new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap = new FPHeapMin(items);
        heap.imprime();
        assertEquals("1 2 3 4 5 ", heap.toString());
    }

    @Test(timeout = 1000)
    public void testCopia() {
        Item[] items1 = { new MeuItem(3), new MeuItem(2), new MeuItem(1) };
        FPHeapMin heap1 = new FPHeapMin(items1);

        Item[] items2 = { new MeuItem(6), new MeuItem(7), new MeuItem(8), new MeuItem(9) };
        heap1.copia(items2);
        assertEquals("6 7 8 9 ", heap1.toString());
    }
}