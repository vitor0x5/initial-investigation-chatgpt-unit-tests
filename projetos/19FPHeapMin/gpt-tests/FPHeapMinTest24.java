package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class FPHeapMinTest24{


    private FPHeapMin heap;

    @Before
    public void setUp() {
        heap = new FPHeapMin(10);
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(7);
        heap.copia(items);
        heap.refaz(1, 5);
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(7);
        heap.copia(items);
        heap.constroi();
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(7);
        heap.copia(items);
        Item min = heap.retiraMin();
        assertEquals(2, min.recuperaChave());
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(7);
        heap.copia(items);
        heap.diminuiChave(3, 1);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(7);
        heap.copia(items);
        Item newItem = new MeuItem(1);
        heap.insere(newItem);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() {
        Item[] items = new Item[6];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(7);
        heap.copia(items);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals("5 3 8 2 7 ", outContent.toString());
    }

}