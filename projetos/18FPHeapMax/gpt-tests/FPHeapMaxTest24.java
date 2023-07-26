package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.Random;

public class FPHeapMaxTest24{

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    private FPHeapMax heap;

    @Before
    public void setUp() {
        heap = new FPHeapMax(10);
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(heap);
    }

    @Test
    public void testRefaz() {
        Item[] items = generateItems(10);
        heap.copia(items);
        heap.refaz(1, 10);
        Item max = heap.max();
        assertEquals(items[1], max);
    }

    @Test
    public void testConstroi() {
        Item[] items = generateItems(10);
        heap.copia(items);
        heap.constroi();
        Item max = heap.max();
        assertEquals(items[1], max);
    }

    @Test
    public void testRetiraMax() throws Exception {
        Item[] items = generateItems(10);
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(items[1], max);
    }

    @Test(expected = Exception.class)
    public void testRetiraMaxEmptyHeap() throws Exception {
        heap.retiraMax();
    }

    @Test
    public void testAumentaChave() throws Exception {
        Item[] items = generateItems(10);
        heap.copia(items);
        heap.aumentaChave(5, 100);
        Item max = heap.max();
        assertEquals(100, max.recuperaChave());
    }

    @Test(expected = Exception.class)
    public void testAumentaChaveNull() throws Exception {
        heap.aumentaChave(1, null);
    }

    @Test
    public void testInsere() throws Exception {
        Item[] items = generateItems(10);
        heap.copia(items);
        Item newItem = new MeuItem(100);
        heap.insere(newItem);
        Item max = heap.max();
        assertEquals(newItem, max);
    }

    @Test(expected = Exception.class)
    public void testInsereFullHeap() throws Exception {
        Item[] items = generateItems(10);
        heap.copia(items);
        Item newItem = new MeuItem(100);
        heap.insere(newItem);
        heap.insere(newItem);
    }

    @Test
    public void testImprime() {
        Item[] items = generateItems(10);
        heap.copia(items);
        heap.imprime();
    }

    private Item[] generateItems(int size) {
        Item[] items = new Item[size + 1];
        Random random = new Random();
        for (int i = 1; i <= size; i++) {
            items[i] = new MeuItem(random.nextInt());
        }
        return items;
    }
}