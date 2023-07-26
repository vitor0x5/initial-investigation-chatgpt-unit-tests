package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMaxTest11{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        assertNotNull(heap);
    }
    
    // Test for the refaz() method with true and false values
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(1)};
        int esq = 1;
        int dir = 5;
        heap.refaz(esq, dir);
        
        // Check if the internal heap array is sorted correctly from left to right
        assertEquals(8, ((MeuItem) heap.v[1]).chave);
        assertEquals(5, ((MeuItem) heap.v[2]).chave);
        assertEquals(3, ((MeuItem) heap.v[3]).chave);
        assertEquals(2, ((MeuItem) heap.v[4]).chave);
        assertEquals(1, ((MeuItem) heap.v[5]).chave);
    }
    
    // Test for the constroi() method
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(1), new MeuItem(5), new MeuItem(2), new MeuItem(3), new MeuItem(8)};
        heap.n = 5;
        heap.constroi();
        
        // Check if the internal heap array is sorted correctly from left to right
        assertEquals(8, ((MeuItem) heap.v[1]).chave);
        assertEquals(5, ((MeuItem) heap.v[2]).chave);
        assertEquals(2, ((MeuItem) heap.v[3]).chave);
        assertEquals(3, ((MeuItem) heap.v[4]).chave);
        assertEquals(1, ((MeuItem) heap.v[5]).chave);
    }
    
    // Test for the max() method
    @Test(timeout=1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(1)};
        int max = heap.max();
        assertEquals(8, ((MeuItem) max).chave);
    }
    
    // Test for the retiraMax() method with an empty heap
    @Test(expected=Exception.class, timeout=1000)
    public void testRetiraMaxEmpty() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.retiraMax();
    }
    
    // Test for the retiraMax() method with a non-empty heap
    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(1)};
        heap.n = 5;
        Item max = heap.retiraMax();
        
        // Check if the maximum element is returned correctly and the heap is rearranged
        assertEquals(8, ((MeuItem) max).chave);
        assertEquals(5, ((MeuItem) heap.v[1]).chave);
        assertEquals(3, ((MeuItem) heap.v[2]).chave);
        assertEquals(2, ((MeuItem) heap.v[3]).chave);
        assertEquals(1, ((MeuItem) heap.v[4]).chave);
        assertEquals(null, heap.v[5]);
    }
    
    // Test for the aumentaChave() method with null value for chaveNova
    @Test(expected=Exception.class, timeout=1000)
    public void testAumentaChaveNull() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.aumentaChave(1, null);
    }
    
    // Test for the aumentaChave() method with a valid chaveNova value
    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(1)};
        heap.n = 5;
        heap.aumentaChave(1, 10);
        
        // Check if the element at index 1 is increased to 10
        assertEquals(10, ((MeuItem) heap.v[1]).chave);
    }
    
    // Test for the insere() method with a full heap
    @Test(expected=Exception.class, timeout=1000)
    public void testInsereFull() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(1)};
        heap.n = 5;
        heap.insere(new MeuItem(6));
    }
    
    // Test for the insere() method with a valid item
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), null};
        heap.n = 4;
        heap.insere(new MeuItem(6));
        
        // Check if the element is inserted correctly at the end of the heap and the heap property is maintained
        assertEquals(6, ((MeuItem) heap.v[5]).chave);
        assertEquals(8, ((MeuItem) heap.v[1]).chave);
        assertEquals(5, ((MeuItem) heap.v[2]).chave);
        assertEquals(3, ((MeuItem) heap.v[3]).chave);
        assertEquals(2, ((MeuItem) heap.v[4]).chave);
    }
    
    // Test for the imprime() method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(5);
        heap.v = new Item[]{null, new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(2), new MeuItem(1)};
        heap.n = 5;
        heap.imprime();
        
        // The test only checks if the method executes without errors
    }
}
