package ds;import org.junit.Test;

import ds.Grafo.Aresta;

import static org.junit.Assert.*;

public class GrafoTest4{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 10);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 10);
        assertNotNull(grafo.primeiroListaAdj(1));
        assertNull(grafo.primeiroListaAdj(2));
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 10);
        Aresta aresta = grafo.retiraAresta(1, 2);
        assertNotNull(aresta);
        assertNull(grafo.retiraAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertFalse(grafoT.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 5);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
}