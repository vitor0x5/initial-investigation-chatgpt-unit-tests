package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;

public class AgmPrimTest6{


    @Test(timeout = 1000)
    public void testConstructor() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertNotNull(heap);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.refaz(1, 2);
        // Add assertion
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.constroi();
        // Add assertion
    }

    @Test(timeout = 1000)
    public void testRetiraMin() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        int minimo = heap.retiraMin();
        assertEquals(1, minimo);
    }

    @Test(timeout = 1000)
    public void testDiminuiChave() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.diminuiChave(2, 0.5);
        // Add assertion
    }

    @Test(timeout = 1000)
    public void testVazio() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        boolean isEmpty = heap.vazio();
        assertFalse(isEmpty);
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        double[] p = {0.0, 1.0, 2.0, 3.0};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        heap.imprime();
        // Add assertion
    }
}