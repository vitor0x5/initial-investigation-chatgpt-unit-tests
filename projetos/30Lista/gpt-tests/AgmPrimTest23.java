package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;

public class AgmPrimTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 4);
        assertEquals(1, heap.retiraMin());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        double[] p = {0, 4, 3, 2, 1};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        assertEquals(1, heap.retiraMin());
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertEquals(1, heap.retiraMin());
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(4, 0);
        assertEquals(4, heap.retiraMin());
    }

    @Test(timeout=1000)
    public void testVazio() throws Exception {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertTrue(heap.vazio());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.imprime();
    }

    @Test(expected=Exception.class, timeout=1000)
    public void testRetiraMinException() throws Exception {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.retiraMin();
    }

    @Test(expected=Exception.class, timeout=1000)
    public void testDiminuiChaveException() throws Exception {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(0, -1);
    }

}