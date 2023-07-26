package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class FPHeapMinTest12{


    private FPHeapMin heap;

    @Before
    public void setUp() throws Exception {
        heap = new FPHeapMin(10);
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertEquals(0, heap.n);
        assertEquals(11, heap.v.length);
    }

    @Test(timeout=1000)
    public void testRefaz() {
        Item[] items = new Item[11];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(5);
        items[5] = new MeuItem(6);
        items[6] = new MeuItem(4);
        items[7] = new MeuItem(3);
        items[8] = new MeuItem(2);
        items[9] = new MeuItem(1);
        items[10] = new MeuItem(9);
        heap.copia(items);
        heap.refaz(1, heap.n);
        assertEquals(1, ((MeuItem)heap.v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)heap.v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)heap.v[3]).recuperaChave());
        assertEquals(5, ((MeuItem)heap.v[4]).recuperaChave());
        assertEquals(4, ((MeuItem)heap.v[5]).recuperaChave());
        assertEquals(6, ((MeuItem)heap.v[6]).recuperaChave());
        assertEquals(8, ((MeuItem)heap.v[7]).recuperaChave());
        assertEquals(10, ((MeuItem)heap.v[8]).recuperaChave());
        assertEquals(7, ((MeuItem)heap.v[9]).recuperaChave());
        assertEquals(9, ((MeuItem)heap.v[10]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() {
        Item[] items = new Item[11];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(5);
        items[5] = new MeuItem(6);
        items[6] = new MeuItem(4);
        items[7] = new MeuItem(3);
        items[8] = new MeuItem(2);
        items[9] = new MeuItem(1);
        items[10] = new MeuItem(9);
        heap.copia(items);
        heap.constroi();
        assertEquals(1, ((MeuItem)heap.v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)heap.v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)heap.v[3]).recuperaChave());
        assertEquals(5, ((MeuItem)heap.v[4]).recuperaChave());
        assertEquals(4, ((MeuItem)heap.v[5]).recuperaChave());
        assertEquals(6, ((MeuItem)heap.v[6]).recuperaChave());
        assertEquals(8, ((MeuItem)heap.v[7]).recuperaChave());
        assertEquals(10, ((MeuItem)heap.v[8]).recuperaChave());
        assertEquals(7, ((MeuItem)heap.v[9]).recuperaChave());
        assertEquals(9, ((MeuItem)heap.v[10]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testMin() {
        Item[] items = new Item[11];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(5);
        items[5] = new MeuItem(6);
        items[6] = new MeuItem(4);
        items[7] = new MeuItem(3);
        items[8] = new MeuItem(2);
        items[9] = new MeuItem(1);
        items[10] = new MeuItem(9);
        heap.copia(items);
        heap.constroi();
        assertEquals(1, ((MeuItem)heap.min()).recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[11];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(5);
        items[5] = new MeuItem(6);
        items[6] = new MeuItem(4);
        items[7] = new MeuItem(3);
        items[8] = new MeuItem(2);
        items[9] = new MeuItem(1);
        items[10] = new MeuItem(9);
        heap.copia(items);
        heap.constroi();
        Item min = heap.retiraMin();
        assertEquals(1, ((MeuItem)min).recuperaChave());
        assertEquals(2, ((MeuItem)heap.v[1]).recuperaChave());
        assertEquals(4, ((MeuItem)heap.v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)heap.v[3]).recuperaChave());
        assertEquals(5, ((MeuItem)heap.v[4]).recuperaChave());
        assertEquals(6, ((MeuItem)heap.v[5]).recuperaChave());
        assertEquals(9, ((MeuItem)heap.v[6]).recuperaChave());
        assertEquals(8, ((MeuItem)heap.v[7]).recuperaChave());
        assertEquals(10, ((MeuItem)heap.v[8]).recuperaChave());
        assertEquals(7, ((MeuItem)heap.v[9]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[11];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(5);
        items[5] = new MeuItem(6);
        items[6] = new MeuItem(4);
        items[7] = new MeuItem(3);
        items[8] = new MeuItem(2);
        items[9] = new MeuItem(1);
        items[10] = new MeuItem(9);
        heap.copia(items);
        heap.constroi();
        heap.diminuiChave(2, 1);
        assertEquals(1, ((MeuItem)heap.v[1]).recuperaChave());
        assertEquals(1, ((MeuItem)heap.v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)heap.v[3]).recuperaChave());
        assertEquals(5, ((MeuItem)heap.v[4]).recuperaChave());
        assertEquals(4, ((MeuItem)heap.v[5]).recuperaChave());
        assertEquals(6, ((MeuItem)heap.v[6]).recuperaChave());
        assertEquals(8, ((MeuItem)heap.v[7]).recuperaChave());
        assertEquals(10, ((MeuItem)heap.v[8]).recuperaChave());
        assertEquals(7, ((MeuItem)heap.v[9]).recuperaChave());
        assertEquals(9, ((MeuItem)heap.v[10]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[11];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(5);
        items[5] = new MeuItem(6);
        items[6] = new MeuItem(4);
        items[7] = new MeuItem(3);
        items[8] = new MeuItem(2);
        items[9] = new MeuItem(1);
        items[10] = new MeuItem(9);
        heap.copia(items);
        heap.constroi();
        Item newItem = new MeuItem(0);
        heap.insere(newItem);
        assertEquals(0, ((MeuItem)heap.v[1]).recuperaChave());
        assertEquals(1, ((MeuItem)heap.v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)heap.v[3]).recuperaChave());
        assertEquals(5, ((MeuItem)heap.v[4]).recuperaChave());
        assertEquals(4, ((MeuItem)heap.v[5]).recuperaChave());
        assertEquals(6, ((MeuItem)heap.v[6]).recuperaChave());
        assertEquals(8, ((MeuItem)heap.v[7]).recuperaChave());
        assertEquals(10, ((MeuItem)heap.v[8]).recuperaChave());
        assertEquals(7, ((MeuItem)heap.v[9]).recuperaChave());
        assertEquals(9, ((MeuItem)heap.v[10]).recuperaChave());
        assertEquals(11, heap.n);
    }
}