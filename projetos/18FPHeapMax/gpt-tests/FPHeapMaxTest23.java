package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class FPHeapMaxTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = generateItems(10);
        heap.copia(items);

        heap.refaz(1, 10);
        assertEquals(10, heap.max().recuperaChave());

        heap.refaz(2, 5);
        assertEquals(8, heap.max().recuperaChave());

        heap.refaz(3, 7);
        assertEquals(7, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = generateItems(10);
        heap.copia(items);

        heap.constroi();
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = generateItems(10);
        heap.copia(items);

        Item max = heap.retiraMax();
        assertEquals(10, max.recuperaChave());
        assertEquals(9, heap.max().recuperaChave());

        max = heap.retiraMax();
        assertEquals(9, max.recuperaChave());
        assertEquals(8, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = generateItems(10);
        heap.copia(items);

        heap.aumentaChave(3, 15);
        assertEquals(15, heap.max().recuperaChave());

        heap.aumentaChave(5, 20);
        assertEquals(20, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = generateItems(10);
        heap.copia(items);

        Item newItem = new MeuItem(15);
        heap.insere(newItem);
        assertEquals(15, heap.max().recuperaChave());

        newItem = new MeuItem(20);
        heap.insere(newItem);
        assertEquals(20, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item[] items = generateItems(10);
        heap.copia(items);

        heap.imprime();
    }

    private Item[] generateItems(int size) {
        Item[] items = new Item[size+1];
        Random random = new Random();

        for (int i = 1; i <= size; i++) {
            items[i] = new MeuItem(random.nextInt(100));
        }

        return items;
    }
}