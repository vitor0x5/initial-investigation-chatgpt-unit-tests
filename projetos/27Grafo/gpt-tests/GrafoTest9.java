package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest9{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNotNull(grafo);
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(10);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 10);
        assertEquals(0, grafo.primeiroListaAdj(1).v1());
        assertEquals(1, grafo.primeiroListaAdj(1).v2());
        assertEquals(10, grafo.primeiroListaAdj(1).peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 10);
        assertNull(grafo.proxAdj(1));
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.imprime();
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(10);
        assertEquals(10, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(10);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}