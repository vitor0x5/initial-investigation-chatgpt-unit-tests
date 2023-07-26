package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;

public class FPHeapMaxTest10{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        FPHeapMax heap = new FPHeapMax(5);
        assertEquals(0, heap.n);
    }

    @Test(timeout=1000)
    public void testRefaz() {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        heap.copia(items);
        heap.refaz(1, heap.n);
        assertEquals(new MeuItem(5), heap.v[1]);
    }
    
    @Test(timeout=1000)
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        heap.copia(items);
        heap.constroi();
        assertEquals(new MeuItem(5), heap.v[1]);
    }
    
    @Test(timeout=1000)
    public void testMax() {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        heap.copia(items);
        Item max = heap.max();
        assertEquals(new MeuItem(5), max);
    }
    
    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(new MeuItem(5), max);
    }
    
    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        heap.copia(items);
        heap.aumentaChave(3, new MeuItem(6));
        assertEquals(new MeuItem(6), heap.v[1]);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4)};
        heap.copia(items);
        Item item = new MeuItem(5);
        heap.insere(item);
        assertEquals(item, heap.v[heap.n]);
    }
    
    @Test(timeout=1000)
    public void testImprime() {
        FPHeapMax heap = new FPHeapMax(5);
        Item[] items = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4), new MeuItem(5)};
        heap.copia(items);
        heap.imprime();
    }

}