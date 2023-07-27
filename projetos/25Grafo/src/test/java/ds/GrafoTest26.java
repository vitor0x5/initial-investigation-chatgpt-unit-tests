package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest26{


    @Test( timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }

    @Test( timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test( timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }

    @Test( timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 10);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test( timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        assertNotNull(grafo.primeiroListaAdj(1));
    }

    @Test( timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        assertNotNull(grafo.proxAdj(1));
    }

    @Test( timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        assertNotNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(1, 4));
    }

    @Test( timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.imprime();
    }

    @Test( timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }

    @Test( timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}