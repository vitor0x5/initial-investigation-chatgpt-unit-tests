package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;

public class AgmPrimTest19{


    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMinEmptyHeap() throws Exception {
        double[] p = new double[0];
        int[] v = new int[0];
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.retiraMin();
    }

    @Test(timeout = 1000)
    public void testRetiraMin() throws Exception {
        double[] p = {0, 1, 2, 3};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int min = heap.retiraMin();
        assertEquals(1, min);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChaveInvalidValue() throws Exception {
        double[] p = {0, 1, 2, 3};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(1, -1);
    }

    @Test(timeout = 1000)
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 1, 2, 3};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(3, 0);
        assertEquals(0, p[3], 0.001);
    }

    @Test(timeout = 1000)
    public void testVazioEmptyHeap() {
        double[] p = new double[0];
        int[] v = new int[0];
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertTrue(heap.vazio());
    }

    @Test(timeout = 1000)
    public void testVazioNonEmptyHeap() {
        double[] p = {0, 1, 2, 3};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertFalse(heap.vazio());
    }

    @Test(timeout = 1000)
    public void testImprimeEmptyHeap() {
        double[] p = new double[0];
        int[] v = new int[0];
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.imprime();
    }

    @Test(timeout = 1000)
    public void testImprimeNonEmptyHeap() {
        double[] p = {0, 1, 2, 3};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.imprime();
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        FPHeapMinIndireto heap = new FPHeapMinIndireto();
        assertNotNull(heap);
    }
}