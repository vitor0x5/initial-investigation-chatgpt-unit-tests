package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.Arrays;

public class FPHeapMaxTest20{


    private FPHeapMax heap;

    @Before
    public void setUp() {
        heap = new FPHeapMax(10);
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        heap.refaz(1, heap.n);
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        heap.constroi();
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testMax() {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        assertEquals(10, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        Item max = heap.retiraMax();
        assertEquals(10, max.recuperaChave());
        assertEquals(8, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        heap.aumentaChave(2, 15);
        assertEquals(15, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        Item newItem = new MeuItem(15);
        heap.insere(newItem);
        assertEquals(15, heap.max().recuperaChave());
    }

    @Test(timeout=1000)
    public void testImprime() {
        Item[] items = {null, new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
        heap.copia(items);
        heap.imprime();
    }
}