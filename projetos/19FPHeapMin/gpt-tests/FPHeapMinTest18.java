package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class FPHeapMinTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(v);
        heap.refaz(1, 5);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(v);
        heap.constroi();
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(v);
        Item min = heap.retiraMin();
        assertEquals(1, min.recuperaChave());
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(v);
        heap.diminuiChave(3, 2);
        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(v);
        heap.insere(new MeuItem(2));
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(v);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals("1 3 8 5 6 ", outContent.toString());
    }

    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item[] v1 = new Item[6];
        v1[1] = new MeuItem(5);
        v1[2] = new MeuItem(3);
        v1[3] = new MeuItem(8);
        v1[4] = new MeuItem(1);
        v1[5] = new MeuItem(6);
        FPHeapMin heap1 = new FPHeapMin(v1);
        Item[] v2 = new Item[6];
        heap1.copia(v2);
        FPHeapMin heap2 = new FPHeapMin(v2);
        assertEquals(1, heap2.min().recuperaChave());
    }
}