package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.FPHeapMax;
import ds.Item;

public class FPHeapMaxTest2{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }
    
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[6];
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(20);
        items[3] = new MeuItem(30);
        items[4] = new MeuItem(40);
        items[5] = new MeuItem(50);
        heap.copia(items);
        heap.refaz(1, 5);
        assertEquals(50, heap.max().recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[6];
        items[1] = new MeuItem(30);
        items[2] = new MeuItem(20);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(50);
        items[5] = new MeuItem(40);
        heap.copia(items);
        heap.constroi();
        assertEquals(50, heap.max().recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[6];
        items[1] = new MeuItem(30);
        items[2] = new MeuItem(20);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(50);
        items[5] = new MeuItem(40);
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(50, max.recuperaChave());
        assertEquals(4, heap.max().recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[6];
        items[1] = new MeuItem(30);
        items[2] = new MeuItem(20);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(50);
        items[5] = new MeuItem(40);
        heap.copia(items);
        heap.aumentaChave(3, 60);
        assertEquals(60, heap.max().recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = new Item[6];
        items[1] = new MeuItem(30);
        items[2] = new MeuItem(20);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(50);
        items[5] = new MeuItem(40);
        heap.copia(items);
        heap.insere(new MeuItem(60));
        assertEquals(60, heap.max().recuperaChave());
    }
}