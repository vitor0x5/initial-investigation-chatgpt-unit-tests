package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class AgmPrimTest18{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertNotNull(agmPrim);
    }

    // Test for the refaz method
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.refaz(1, 4);
        assertEquals(2, fpHeapMinIndireto.retiraMin());
    }

    // Test for the constroi method
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.constroi();
        assertEquals(1, fpHeapMinIndireto.retiraMin());
    }

    // Test for the retiraMin method
    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        assertEquals(1, fpHeapMinIndireto.retiraMin());
    }

    // Test for the diminuiChave method
    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.diminuiChave(2, 0.5);
        assertEquals(2, fpHeapMinIndireto.retiraMin());
    }

    // Test for the vazio method
    @Test(timeout=1000)
    public void testVazio() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        assertFalse(fpHeapMinIndireto.vazio());
    }

    // Test for the imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        double[] p = {0, 1, 2, 3, 4};
        int[] v = {0, 1, 2, 3, 4};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.imprime();
    }
}