package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class FPHeapMaxTest15{


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
        items[2] = new MeuItem(10);
        items[3] = new MeuItem(15);
        items[4] = new MeuItem(20);
        items[5] = new MeuItem(25);
        items[6] = new MeuItem(30);
        items[7] = new MeuItem(35);
        items[8] = new MeuItem(40);
        items[9] = new MeuItem(45);
        items[10] = new MeuItem(50);
        heap.copia(items);
        heap.refaz(1, 10);
        assertEquals(50, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(50);
        items[2] = new MeuItem(45);
        items[3] = new MeuItem(40);
        items[4] = new MeuItem(35);
        items[5] = new MeuItem(30);
        items[6] = new MeuItem(25);
        items[7] = new MeuItem(20);
        items[8] = new MeuItem(15);
        items[9] = new MeuItem(10);
        items[10] = new MeuItem(5);
        heap.copia(items);
        heap.constroi();
        assertEquals(50, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(50);
        items[2] = new MeuItem(45);
        items[3] = new MeuItem(40);
        items[4] = new MeuItem(35);
        items[5] = new MeuItem(30);
        items[6] = new MeuItem(25);
        items[7] = new MeuItem(20);
        items[8] = new MeuItem(15);
        items[9] = new MeuItem(10);
        items[10] = new MeuItem(5);
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(50, max.recuperaChave());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(50);
        items[2] = new MeuItem(45);
        items[3] = new MeuItem(40);
        items[4] = new MeuItem(35);
        items[5] = new MeuItem(30);
        items[6] = new MeuItem(25);
        items[7] = new MeuItem(20);
        items[8] = new MeuItem(15);
        items[9] = new MeuItem(10);
        items[10] = new MeuItem(5);
        heap.copia(items);
        heap.aumentaChave(5, 100);
        assertEquals(100, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(50);
        items[2] = new MeuItem(45);
        items[3] = new MeuItem(40);
        items[4] = new MeuItem(35);
        items[5] = new MeuItem(30);
        items[6] = new MeuItem(25);
        items[7] = new MeuItem(20);
        items[8] = new MeuItem(15);
        items[9] = new MeuItem(10);
        items[10] = new MeuItem(5);
        heap.copia(items);
        Item newItem = new MeuItem(60);
        heap.insere(newItem);
        assertEquals(60, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[11];
        items[1] = new MeuItem(50);
        items[2] = new MeuItem(45);
        items[3] = new MeuItem(40);
        items[4] = new MeuItem(35);
        items[5] = new MeuItem(30);
        items[6] = new MeuItem(25);
        items[7] = new MeuItem(20);
        items[8] = new MeuItem(15);
        items[9] = new MeuItem(10);
        items[10] = new MeuItem(5);
        heap.copia(items);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals("50 45 40 35 30 25 20 15 10 5\n", outContent.toString());
    }
}