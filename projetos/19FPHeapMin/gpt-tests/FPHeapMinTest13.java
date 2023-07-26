package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class FPHeapMinTest13{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 4);
        assertEquals(2, ((MeuItem) heap.min()).chave);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(9);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        assertEquals(2, ((MeuItem) heap.min()).chave);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);
        Item min = heap.retiraMin();
        assertEquals(2, ((MeuItem) min).chave);
        assertEquals(3, ((MeuItem) heap.min()).chave);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);
        heap.diminuiChave(3, 1);
        assertEquals(1, ((MeuItem) heap.min()).chave);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(items);
        heap.insere(new MeuItem(2));
        assertEquals(2, ((MeuItem) heap.min()).chave);
    }

    @Test(timeout = 1000)
    public void testImprime() {
        Item[] items = new Item[4];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(items);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals("5 3 7 ", outContent.toString());
    }

    @Test(timeout = 1000)
    public void testCopia() {
        Item[] items = new Item[4];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        FPHeapMin heap = new FPHeapMin(10);
        heap.copia(items);
        assertEquals(3, heap.min().compara(new MeuItem(3)));
    }
}