package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(10);
        assertEquals(10, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(10);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.primeiroListaAdj(0));
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.proxAdj(0));
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }

}