package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.primeiroListaAdj(0));
    }

    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.proxAdj(0));
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertTrue(grafoT.existeAresta(1, 0));
    }
}