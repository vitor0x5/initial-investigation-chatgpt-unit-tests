package ds;import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class FPHeapMaxTest7{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        FPHeapMax heap = new FPHeapMax(10);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with empty heap
        heap.refaz(0, 0);

        // Test with non-empty heap
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
        heap.refaz(1, 2);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with empty heap
        heap.constroi();

        // Test with non-empty heap
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
        heap.constroi();
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with empty heap
        assertNull(heap.max());

        // Test with non-empty heap
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
        assertEquals(item2, heap.max());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with empty heap
        try {
            heap.retiraMax();
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: heap vazio", e.getMessage());
        }

        // Test with non-empty heap
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
        assertEquals(item2, heap.retiraMax());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with invalid input
        Item item = new MeuItem(5);
        try {
            heap.aumentaChave(0, item);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: chaveNova com valor null", e.getMessage());
        }

        // Test with valid input
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
        heap.aumentaChave(1, new MeuItem(15));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with invalid input
        try {
            heap.insere(null);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: heap cheio", e.getMessage());
        }

        // Test with valid input
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with empty heap
        heap.imprime();

        // Test with non-empty heap
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        heap.insere(item1);
        heap.insere(item2);
        heap.imprime();
    }

    @Test(timeout=1000)
    public void testCopia() {
        FPHeapMax heap = new FPHeapMax(10);

        // Test with empty heap
        Item[] items = new Item[0];
        heap.copia(items);

        // Test with non-empty heap
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        items = new Item[]{null, item1, item2};
        heap.copia(items);
    }
}