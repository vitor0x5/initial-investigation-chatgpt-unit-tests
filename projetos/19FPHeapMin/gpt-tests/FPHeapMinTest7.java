package ds;import ds.FPHeapMin;
import ds.Item;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FPHeapMinTest7{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() {
        FPHeapMin heap = new FPHeapMin(10);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMinEmptyHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);

        heap.retiraMin();
    }

    @Test(timeout = 1000)
    public void testRetiraMin() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.insere(new MeuItem(10));

        Item result = heap.retiraMin();
        assertEquals(10, result.recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChaveNull() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.insere(new MeuItem(10));

        heap.diminuiChave(1, null);
    }

    @Test(timeout = 1000)
    public void testDiminuiChave() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.insere(new MeuItem(10));
        heap.insere(new MeuItem(20));
        heap.insere(new MeuItem(30));

        heap.diminuiChave(3, 5);
        Item result = heap.retiraMin();
        assertEquals(5, result.recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereHeapFull() throws Exception {
        FPHeapMin heap = new FPHeapMin(2);
        heap.insere(new MeuItem(10));
        heap.insere(new MeuItem(20));

        heap.insere(new MeuItem(30));
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.insere(new MeuItem(10));
        heap.insere(new MeuItem(20));
        heap.insere(new MeuItem(30));

        Item result = heap.retiraMin();
        assertEquals(10, result.recuperaChave());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.insere(new MeuItem(10));
        heap.insere(new MeuItem(20));
        heap.insere(new MeuItem(30));

        heap.imprime();
    }

    
}