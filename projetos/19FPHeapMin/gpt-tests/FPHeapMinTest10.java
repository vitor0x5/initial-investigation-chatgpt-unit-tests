package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest10{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        heap.refaz(2, 5);

        assertEquals(1, (int) v[2].recuperaChave());
        assertEquals(7, (int) v[5].recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        heap.constroi();

        assertEquals(1, (int) v[1].recuperaChave());
        assertEquals(7, (int) v[5].recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMin() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        Item min = heap.min();

        assertEquals(1, (int) min.recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        Item min = heap.retiraMin();

        assertEquals(1, (int) min.recuperaChave());
        assertEquals(4, (int) v[1].recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        heap.diminuiChave(3, 0);

        assertEquals(0, (int) v[1].recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        Item newItem = new MeuItem(0);
        heap.insere(newItem);

        assertEquals(0, (int) heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        heap.imprime();
    }

    @Test(timeout = 1000)
    public void testCopia() throws Exception {
        Item[] v = new Item[6];
        v[0] = null; // Dummy element
        v[1] = new MeuItem(8);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(7);

        FPHeapMin heap = new FPHeapMin(v);

        Item[] newV = new Item[6];
        heap.copia(newV);

        assertEquals(8, (int) newV[1].recuperaChave());
        assertEquals(7, (int) newV[5].recuperaChave());
    }
}