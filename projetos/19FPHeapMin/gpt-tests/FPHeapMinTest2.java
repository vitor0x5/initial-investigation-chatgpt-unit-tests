package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMinTest2{


    @Test
    public void testConstrutor1() {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test
    public void testConstrutor2() {
        Item[] items = new Item[5];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(7);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);
        assertNotNull(heap);
    }

    @Test
    public void testRefaz() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);
        heap.refaz(1, 5);

        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    @Test
    public void testConstroi() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();

        assertEquals(1, heap.min().compara(new MeuItem(1)));
    }

    @Test
    public void testRetiraMin() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);

        try {
            Item min = heap.retiraMin();
            assertEquals(1, min.compara(new MeuItem(1)));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(expected = Exception.class)
    public void testRetiraMinEmptyHeap() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        heap.retiraMin();
    }

    @Test
    public void testDiminuiChave() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);

        try {
            heap.diminuiChave(3, 0);
            assertEquals(0, items[3].compara(new MeuItem(0)));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(expected = Exception.class)
    public void testDiminuiChaveNull() throws Exception {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);

        heap.diminuiChave(3, null);
    }

    @Test
    public void testInsere() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);

        try {
            Item newItem = new MeuItem(0);
            heap.insere(newItem);
            assertEquals(0, items[6].compara(new MeuItem(0)));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(expected = Exception.class)
    public void testInsereFullHeap() throws Exception {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);

        Item newItem = new MeuItem(0);
        heap.insere(newItem);
    }

    @Test
    public void testImprime() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(items);

        heap.imprime();
    }

    @Test
    public void testCopia() {
        Item[] items = new Item[6];
        items[0] = null; // Index 0 should not be used
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(2);
        items[3] = new MeuItem(7);
        items[4] = new MeuItem(1);
        items[5] = new MeuItem(3);

        FPHeapMin heap = new FPHeapMin(10);
        heap.copia(items);

        assertEquals(5, heap.min().compara(new MeuItem(1)));
    }
}