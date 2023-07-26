package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Grafo;

public class GrafoTest24{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 0));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNotNull(grafo.primeiroListaAdj(1));
        assertNotNull(grafo.primeiroListaAdj(2));
        assertNull(grafo.primeiroListaAdj(3));
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertNotNull(grafo.proxAdj(0));
        assertNotNull(grafo.proxAdj(1));
        assertNotNull(grafo.proxAdj(2));
        assertNull(grafo.proxAdj(3));
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNotNull(grafo.retiraAresta(1, 2));
        assertNotNull(grafo.retiraAresta(2, 0));
        assertNull(grafo.retiraAresta(0, 2));
        assertNull(grafo.retiraAresta(1, 0));
        assertNull(grafo.retiraAresta(2, 1));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}