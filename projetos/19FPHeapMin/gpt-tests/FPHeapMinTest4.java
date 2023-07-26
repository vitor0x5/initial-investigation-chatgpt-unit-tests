package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMinTest4{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }
    
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);
        
        assertEquals(3, ((MeuItem)heap.min()).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);
        
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();
        
        assertEquals(3, ((MeuItem)heap.min()).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);
        
        FPHeapMin heap = new FPHeapMin(items);
        
        assertEquals(3, ((MeuItem)heap.min()).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);
        
        FPHeapMin heap = new FPHeapMin(items);
        
        Item min = heap.retiraMin();
        assertEquals(3, ((MeuItem)min).recuperaChave());
        
        min = heap.min();
        assertEquals(5, ((MeuItem)min).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);
        
        FPHeapMin heap = new FPHeapMin(items);
        
        heap.diminuiChave(4, 2);
        
        Item min = heap.min();
        assertEquals(2, ((MeuItem)min).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);
        
        FPHeapMin heap = new FPHeapMin(items);
        
        Item newItem = new MeuItem(2);
        heap.insere(newItem);
        
        Item min = heap.min();
        assertEquals(2, ((MeuItem)min).recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        
        FPHeapMin heap = new FPHeapMin(items);
        
        heap.imprime();
    }
    
    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item[] items = new Item[4];
        items[1] = new MeuItem(8);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(10);
        
        FPHeapMin heap = new FPHeapMin(6);
        heap.copia(items);
        
        Item min = heap.min();
        assertEquals(5, ((MeuItem)min).recuperaChave());
    }
}