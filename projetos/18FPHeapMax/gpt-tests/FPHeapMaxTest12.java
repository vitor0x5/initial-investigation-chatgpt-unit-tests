package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest12{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.refaz(1, 5);
        assertNotNull(heap);
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.constroi();
        assertNotNull(heap);
    }

    @Test(timeout = 1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item maxItem = heap.max();
        assertNull(maxItem);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.retiraMax();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.aumentaChave(1, null);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        Item item = new MeuItem(10);
        heap.insere(item);
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.imprime();
    }
}