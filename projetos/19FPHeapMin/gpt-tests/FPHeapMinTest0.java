package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.io.*;

public class FPHeapMinTest0{

    
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);
    
    private FPHeapMin heap;
    private MeuItem item1, item2, item3, item4, item5;
    
    @Before
    public void setUp() {
        heap = new FPHeapMin(5);
        item1 = new MeuItem(10);
        item2 = new MeuItem(20);
        item3 = new MeuItem(30);
        item4 = new MeuItem(40);
        item5 = new MeuItem(50);
    }
    
    @Test
    public void testDefaultConstructor() {
        FPHeapMin emptyHeap = new FPHeapMin(0);
        assertNotNull(emptyHeap);
    }
    
    @Test
    public void testRefaz() throws Exception {
        heap.copia(new Item[]{null, item1, item2, item3, item4});
        heap.refaz(1, heap.n);
        assertEquals(item1, heap.min());
        
        heap.copia(new Item[]{null, item5, item3, item4, item2});
        heap.refaz(1, heap.n);
        assertEquals(item2, heap.min());
        
        heap.copia(new Item[]{null, item4, item3, item2, item1});
        heap.refaz(1, heap.n);
        assertEquals(item1, heap.min());
    }
    
    @Test
    public void testConstroi() throws Exception {
        heap.copia(new Item[]{null, item5, item3, item4, item2});
        heap.constroi();
        assertEquals(item2, heap.min());
        
        heap.copia(new Item[]{null, item4, item3, item2, item1});
        heap.constroi();
        assertEquals(item1, heap.min());
    }
    
    @Test
    public void testMin() throws Exception {
        heap.copia(new Item[]{null, item3, item1, item2, item4});
        assertEquals(item1, heap.min());
        
        heap.copia(new Item[]{null, item5, item3, item4, item2});
        assertEquals(item2, heap.min());
        
        heap.copia(new Item[]{null, item4, item3, item2, item1});
        assertEquals(item1, heap.min());
    }
    
    @Test
    public void testRetiraMin() throws Exception {
        heap.copia(new Item[]{null, item3, item1, item2, item4});
        Item removed = heap.retiraMin();
        assertEquals(item1, removed);
        assertEquals(item2, heap.min());
        
        removed = heap.retiraMin();
        assertEquals(item2, removed);
        assertEquals(item3, heap.min());
        
        removed = heap.retiraMin();
        assertEquals(item3, removed);
        assertEquals(item4, heap.min());
    }
    
    @Test(expected=Exception.class)
    public void testRetiraMinEmpty() throws Exception {
        heap.retiraMin();
    }
    
    @Test
    public void testDiminuiChave() throws Exception {
        heap.copia(new Item[]{null, item3, item1, item2, item4});
        heap.diminuiChave(4, -10);
        assertEquals(item4, heap.min());
        
        heap.diminuiChave(3, -20);
        assertEquals(item3, heap.min());
        
        heap.diminuiChave(2, -30);
        assertEquals(item2, heap.min());
    }
    
    @Test(expected=Exception.class)
    public void testDiminuiChaveNull() throws Exception {
        heap.diminuiChave(1, null);
    }
    
    @Test
    public void testInsere() throws Exception {
        heap.insere(item3);
        assertEquals(item3, heap.min());
        
        heap.insere(item1);
        assertEquals(item1, heap.min());
        
        heap.insere(item4);
        assertEquals(item1, heap.min());
    }
    
    @Test(expected=Exception.class)
    public void testInsereFull() throws Exception {
        heap.copia(new Item[]{null, item3, item1, item2, item4});
        heap.insere(item5);
    }
    
    @Test
    public void testImprime() {
        heap.copia(new Item[]{null, item3, item1, item2, item4});
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        heap.imprime();
        assertEquals("1 2 3 4 ", outContent.toString());
    }
    
    @Test
    public void testCopia() {
        Item[] array = new Item[]{null, item3, item1, item2, item4};
        heap.copia(array);
        assertArrayEquals(array, heap.v);
    }
    
}