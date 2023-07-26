package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest5{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 3);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
    }

    @Test(timeout = 1000)
    public void testMin() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.min();
        assertEquals(items[1], min);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        assertEquals(items[1], min);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(2, 0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        heap.imprime();
    }

    @Test(timeout = 1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(1);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(3);
        FPHeapMin heap = new FPHeapMin(items);
        Item[] copiedItems = new Item[4];
        heap.copia(copiedItems);
    }
}