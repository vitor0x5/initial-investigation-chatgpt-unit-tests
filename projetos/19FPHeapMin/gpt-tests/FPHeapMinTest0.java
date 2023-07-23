package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMinTest0{


    @Test
    public void testRefaz() {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(1);
        heap.v[2] = new MeuItem(6);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(4);
        heap.v[5] = new MeuItem(2);
        heap.n = 5;
        heap.refaz(1, heap.n);
        assertEquals(1, ((MeuItem) heap.v[1]).chave);
        assertEquals(2, ((MeuItem) heap.v[2]).chave);
        assertEquals(3, ((MeuItem) heap.v[3]).chave);
        assertEquals(4, ((MeuItem) heap.v[4]).chave);
        assertEquals(6, ((MeuItem) heap.v[5]).chave);
    }

    @Test
    public void testConstroi() {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(6);
        heap.v[2] = new MeuItem(4);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(2);
        heap.v[5] = new MeuItem(1);
        heap.n = 5;
        heap.constroi();
        assertEquals(1, ((MeuItem) heap.v[1]).chave);
        assertEquals(2, ((MeuItem) heap.v[2]).chave);
        assertEquals(3, ((MeuItem) heap.v[3]).chave);
        assertEquals(4, ((MeuItem) heap.v[4]).chave);
        assertEquals(6, ((MeuItem) heap.v[5]).chave);
    }

    @Test
    public void testMin() {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(1);
        heap.v[2] = new MeuItem(2);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(4);
        heap.v[5] = new MeuItem(5);
        heap.n = 5;
        assertEquals(1, ((MeuItem) heap.min()).chave);
    }

    @Test
    public void testRetiraMin() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(1);
        heap.v[2] = new MeuItem(2);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(4);
        heap.v[5] = new MeuItem(5);
        heap.n = 5;
        Item min = heap.retiraMin();
        assertEquals(1, ((MeuItem) min).chave);
        assertEquals(2, ((MeuItem) heap.v[1]).chave);
        assertEquals(3, ((MeuItem) heap.v[2]).chave);
        assertEquals(4, ((MeuItem) heap.v[3]).chave);
        assertEquals(5, ((MeuItem) heap.v[4]).chave);
    }

    @Test
    public void testDiminuiChave() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(1);
        heap.v[2] = new MeuItem(2);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(4);
        heap.v[5] = new MeuItem(5);
        heap.n = 5;
        heap.diminuiChave(3, 0);
        assertEquals(0, ((MeuItem) heap.v[1]).chave);
        assertEquals(2, ((MeuItem) heap.v[2]).chave);
        assertEquals(1, ((MeuItem) heap.v[3]).chave);
        assertEquals(4, ((MeuItem) heap.v[4]).chave);
        assertEquals(5, ((MeuItem) heap.v[5]).chave);
    }

    @Test
    public void testInsere() throws Exception {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(1);
        heap.v[2] = new MeuItem(2);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(4);
        heap.n = 4;
        heap.insere(new MeuItem(0));
        assertEquals(0, ((MeuItem) heap.v[1]).chave);
        assertEquals(1, ((MeuItem) heap.v[2]).chave);
        assertEquals(3, ((MeuItem) heap.v[3]).chave);
        assertEquals(4, ((MeuItem) heap.v[4]).chave);
    }

    @Test
    public void testImprime() {
        FPHeapMin heap = new FPHeapMin(5);
        heap.v[1] = new MeuItem(1);
        heap.v[2] = new MeuItem(2);
        heap.v[3] = new MeuItem(3);
        heap.v[4] = new MeuItem(4);
        heap.v[5] = new MeuItem(5);
        heap.n = 5;
        heap.imprime();
    }

    @Test
    public void testCopia() {
        FPHeapMin heap1 = new FPHeapMin(5);
        heap1.v[1] = new MeuItem(1);
        heap1.v[2] = new MeuItem(2);
        heap1.v[3] = new MeuItem(3);
        heap1.v[4] = new MeuItem(4);
        heap1.v[5] = new MeuItem(5);
        heap1.n = 5;
        FPHeapMin heap2 = new FPHeapMin(5);
        heap2.copia(heap1.v);
        assertEquals(1, ((MeuItem) heap2.v[1]).chave);
        assertEquals(2, ((MeuItem) heap2.v[2]).chave);
        assertEquals(3, ((MeuItem) heap2.v[3]).chave);
        assertEquals(4, ((MeuItem) heap2.v[4]).chave);
        assertEquals(5, ((MeuItem) heap2.v[5]).chave);
    }
}