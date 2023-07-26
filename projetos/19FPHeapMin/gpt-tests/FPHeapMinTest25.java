package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class FPHeapMinTest25{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
        assertEquals(2, ((MeuItem)heap.min()).recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        assertEquals(2, ((MeuItem)heap.min()).recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        assertEquals(2, ((MeuItem)min).recuperaChave());
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, 1);
        assertEquals(1, ((MeuItem)heap.min()).recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        Item newItem = new MeuItem(1);
        heap.insere(newItem);
        assertEquals(1, ((MeuItem)heap.min()).recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals("2 3 8 5 6 ", outContent.toString());
    }

    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(10);
        heap.copia(items);
        assertEquals(5, ((MeuItem)heap.min()).recuperaChave());
    }
}