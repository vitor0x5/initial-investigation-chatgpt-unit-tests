package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(10), new MeuItem(7), new MeuItem(3), new MeuItem(8)});
        heap.refaz(1, 5);
        assertEquals("10 8 7 5 3 ", heap.imprime());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(10), new MeuItem(7), new MeuItem(3), new MeuItem(8)});
        heap.constroi();
        assertEquals("10 8 7 3 5 ", heap.imprime());
    }

    @Test(timeout=1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(10), new MeuItem(7), new MeuItem(3), new MeuItem(8)});
        Item max = heap.max();
        assertEquals(10, max.recuperaChave());
    }

    @Test(timeout=1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(10), new MeuItem(7), new MeuItem(3), new MeuItem(8)});
        Item max = heap.retiraMax();
        assertEquals(10, max.recuperaChave());
        assertEquals("8 5 7 3 ", heap.imprime());
    }

    @Test(timeout=1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(10), new MeuItem(7), new MeuItem(3), new MeuItem(8)});
        heap.aumentaChave(2, 15);
        assertEquals("15 10 7 5 3 ", heap.imprime());
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(5), new MeuItem(10), new MeuItem(7), new MeuItem(3), new MeuItem(8)});
        heap.insere(new MeuItem(15));
        assertEquals("15 10 7 5 3 8 ", heap.imprime());
    }
}