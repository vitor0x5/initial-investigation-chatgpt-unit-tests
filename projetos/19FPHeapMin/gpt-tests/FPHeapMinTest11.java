package ds;import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FPHeapMinTest11{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);
        Item[] arr = {null, item1, item2, item3};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.refaz(1, 3);
        
        assertTrue(heap.min().compara(item3) == 0);
        assertTrue(heap.retiraMin().compara(item3) == 0);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item item1 = new MeuItem(8);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(5);
        Item item4 = new MeuItem(3);
        Item[] arr = {null, item1, item2, item3, item4};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.constroi();
        
        assertTrue(heap.min().compara(item2) == 0);
        assertTrue(heap.retiraMin().compara(item2) == 0);
    }

    @Test(timeout=1000)
    public void testMin() throws Exception {
        Item item1 = new MeuItem(5);
        Item[] arr = {null, item1};
        FPHeapMin heap = new FPHeapMin(arr);
        
        assertTrue(heap.min().compara(item1) == 0);
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item[] arr = {null, item1, item2};
        FPHeapMin heap = new FPHeapMin(arr);
        
        assertTrue(heap.retiraMin().compara(item1) == 0);
    }

    @Test(timeout=1000, expected=Exception.class)
    public void testDiminuiChaveWithNullValue() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item[] arr = {null, item1, item2};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.diminuiChave(2, null);
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item[] arr = {null, item1, item2};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.diminuiChave(2, 3);
        
        assertTrue(heap.min().compara(item2) == 0);
        assertTrue(heap.retiraMin().compara(item2) == 0);
    }

    @Test(timeout=1000, expected=Exception.class)
    public void testInsereWhenHeapIsFull() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item item3 = new MeuItem(3);
        Item[] arr = {null, item1, item2, item3};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.insere(new MeuItem(10));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item item3 = new MeuItem(3);
        Item[] arr = {null, item1, item2, item3};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.insere(new MeuItem(2));
        
        assertTrue(heap.min().compara(item3) == 0);
        assertTrue(heap.retiraMin().compara(item3) == 0);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item item3 = new MeuItem(3);
        Item[] arr = {null, item1, item2, item3};
        FPHeapMin heap = new FPHeapMin(arr);
        
        heap.imprime();
    }

    @Test(timeout=1000)
    public void testCopia() throws Exception {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(8);
        Item item3 = new MeuItem(3);
        Item[] arr = {null, item1, item2, item3};
        FPHeapMin heap = new FPHeapMin(5);
        
        heap.copia(arr);
        
        assertTrue(heap.min().compara(item1) == 0);
    }

}