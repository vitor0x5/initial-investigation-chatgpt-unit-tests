package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import ds.*;

public class FPHeapMaxTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(4);
        items[6] = new MeuItem(1);
        items[7] = new MeuItem(6);
        items[8] = new MeuItem(9);
        items[9] = new MeuItem(8);
        items[10] = new MeuItem(10);
        heap.copia(items);
        heap.refaz(1, 10);
        assertEquals(heap.max(), items[10]);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(4);
        items[6] = new MeuItem(1);
        items[7] = new MeuItem(6);
        items[8] = new MeuItem(9);
        items[9] = new MeuItem(8);
        items[10] = new MeuItem(10);
        heap.copia(items);
        heap.constroi();
        assertEquals(heap.max(), items[10]);
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(4);
        items[6] = new MeuItem(1);
        items[7] = new MeuItem(6);
        items[8] = new MeuItem(9);
        items[9] = new MeuItem(8);
        items[10] = new MeuItem(10);
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(max, items[10]);
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(4);
        items[6] = new MeuItem(1);
        items[7] = new MeuItem(6);
        items[8] = new MeuItem(9);
        items[9] = new MeuItem(8);
        items[10] = new MeuItem(10);
        heap.copia(items);
        heap.aumentaChave(5, 9);
        assertEquals(heap.max(), items[6]);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(4);
        items[6] = new MeuItem(1);
        items[7] = new MeuItem(6);
        items[8] = new MeuItem(9);
        items[9] = new MeuItem(8);
        items[10] = new MeuItem(10);
        heap.copia(items);
        Item newItem = new MeuItem(11);
        heap.insere(newItem);
        assertEquals(heap.max(), newItem);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(3);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(2);
        items[5] = new MeuItem(4);
        items[6] = new MeuItem(1);
        items[7] = new MeuItem(6);
        items[8] = new MeuItem(9);
        items[9] = new MeuItem(8);
        items[10] = new MeuItem(10);
        heap.copia(items);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals(outContent.toString(), "5 3 7 2 4 1 6 9 8 10 \n");
    }
}