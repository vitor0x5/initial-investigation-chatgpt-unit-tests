package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
        
        assertEquals(7, ((MeuItem) heap.min()));
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        
        assertEquals(7, ((MeuItem) heap.min()));
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        
        assertEquals(7, ((MeuItem) min));
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, 5);
        
        assertEquals(5, ((MeuItem) heap.min()));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.insere(new MeuItem(5));
        
        assertEquals(5, ((MeuItem) heap.min()));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.imprime();
    }

    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[6];
        items[0] = null;
        items[1] = new MeuItem(12);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(10);
        items[5] = new MeuItem(8);
        
        FPHeapMin heap = new FPHeapMin(10);
        heap.copia(items);
        
        assertEquals(7, ((MeuItem) heap.min()));
    }
}