package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest17{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    // Test for method refaz
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 3);
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    // Test for method constroi
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    // Test for method min
    @Test(timeout=1000)
    public void testMin() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    // Test for method retiraMin
    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        assertEquals(1, min.compara(new MeuItem(1)));
    }

    // Test for method diminuiChave
    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(2, 1);
        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    // Test for method insere
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.insere(new MeuItem(0));
        assertEquals(0, heap.min().compara(new MeuItem(0)));
    }

    // Test for method imprime
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(items);
        heap.imprime();
        // Expected output: 1 2 4 5 3 8
    }

    // Test for method copia
    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(4);
        FPHeapMin heap = new FPHeapMin(new Item[10]);
        heap.copia(items);
        assertEquals(6, heap.min().compara(new MeuItem(1)));
    }
}