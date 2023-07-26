package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;

public class AgmPrimTest32{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        heap.refaz(0, 0);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        heap.constroi();
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        int result = heap.retiraMin();
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        heap.diminuiChave(0, 0);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testVazio() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        boolean result = heap.vazio();
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        heap.imprime();
        // Add assertions here
    }
}