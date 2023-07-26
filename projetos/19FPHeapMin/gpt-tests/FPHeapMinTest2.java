package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest2{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstructorWithArray() throws Exception {
        Item[] items = new Item[5];
        FPHeapMin heap = new FPHeapMin(items);
        assertNotNull(heap);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        assertNotNull(heap.min());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        assertNotNull(heap.retiraMin());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(1, 2);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        Item newItem = new MeuItem(2);
        heap.insere(newItem);
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        heap.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(4);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(6);
        items[5] = new MeuItem(5);
        FPHeapMin heap = new FPHeapMin(items);
        Item[] newArray = new Item[6];
        heap.copia(newArray);
    }


    @Test(timeout = 1000)
    public void testTamanho() {
        assertEquals(4, MeuItem.tamanho());
    }
}