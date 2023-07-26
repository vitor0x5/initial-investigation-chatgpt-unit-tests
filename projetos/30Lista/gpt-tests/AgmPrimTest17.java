package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import ds.AgmPrim;

public class AgmPrimTest17{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        AgmPrim agmPrim = new AgmPrim(null);
        assertNotNull(agmPrim);
    }
    
    @Test(timeout=1000)
    public void testConstructor() {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        assertNotNull(fpHeap);
    }
    
    @Test(timeout=1000)
    public void testRefaz() {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        fpHeap.refaz(1, 2);
    }
    
    @Test(timeout=1000)
    public void testConstroi() {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        fpHeap.constroi();
    }
    
    @Test(timeout=1000)
    public void testRetiraMin() throws Exception {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        fpHeap.retiraMin();
    }
    
    @Test(timeout=1000)
    public void testDiminuiChave() throws Exception {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        fpHeap.diminuiChave(1, 0.5);
    }
    
    @Test(timeout=1000)
    public void testVazio() {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        fpHeap.vazio();
    }
    
    @Test(timeout=1000)
    public void testImprime() {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto fpHeap = new FPHeapMinIndireto(p, v);
        fpHeap.imprime();
    }
    
    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(3);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }
    
    @Test(timeout=1000)
    public void testAntecessor() {
        Grafo grafo = new Grafo(3);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.antecessor(0);
    }
}