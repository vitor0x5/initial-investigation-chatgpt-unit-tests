package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest15{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(1));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.primeiroListaAdj(1));
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.proxAdj(1));
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.retiraAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.imprime();
        // Assert that no exception is thrown
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}