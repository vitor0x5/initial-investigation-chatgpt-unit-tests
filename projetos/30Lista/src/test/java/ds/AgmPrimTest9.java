package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class AgmPrimTest9{


    @Test(timeout=1000)
    public void testConstructor() throws Exception {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testVazio() throws Exception {
        double[] p = {1.0, 2.0, 3.0};
        int[] v = {1, 2, 3};
        FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
        boolean empty = heap.vazio();
        // Add assertions
    }

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 0, 3);
        AgmPrim agm = new AgmPrim(grafo);
        agm.obterAgm(0);
        // Add assertions
    }

} 