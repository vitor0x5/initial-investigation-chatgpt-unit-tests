package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest11{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(new Grafo(0));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        double[] p = {0, 1, 2, 3};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.refaz(0, 3);
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        double[] p = {0, 9, 2};
        int[] v = {0, 1, 2};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.constroi();
        assertEquals(2, fpHeapMinIndireto.retiraMin());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        double[] p = {0, 3, 2, 1};
        int[] v = {0, 1, 2, 3};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.retiraMin();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        double[] p = {0, 3, 2};
        int[] v = {0, 1, 2};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.diminuiChave(0, -1);
    }

    @Test(timeout = 1000)
    public void testVazio() throws Exception {
        double[] p = {0};
        int[] v = {0};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        assertTrue(fpHeapMinIndireto.vazio());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        double[] p = {0, 1, 2};
        int[] v = {0, 1, 2};
        FPHeapMinIndireto fpHeapMinIndireto = new FPHeapMinIndireto(p, v);
        fpHeapMinIndireto.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }

}