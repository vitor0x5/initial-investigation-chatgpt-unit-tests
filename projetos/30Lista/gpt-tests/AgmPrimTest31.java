package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMinIndireto;

public class AgmPrimTest31{


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

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        // Create a Grafo object
        Grafo grafo = new Grafo(0);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testAntecessor() throws Exception {
        // Create a Grafo object
        Grafo grafo = new Grafo(0);
        AgmPrim agmPrim = new AgmPrim(grafo);
        int result = agmPrim.antecessor(0);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testPeso() throws Exception {
        // Create a Grafo object
        Grafo grafo = new Grafo(0);
        AgmPrim agmPrim = new AgmPrim(grafo);
        double result = agmPrim.peso(0);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testImprimeAgmPrim() throws Exception {
        // Create a Grafo object
        Grafo grafo = new Grafo(0);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.imprime();
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        // Create a Grafo object
        Grafo grafo = new Grafo(0);
        grafo.insereAresta(0, 0, 0);
        // Add assertions here
    }

}