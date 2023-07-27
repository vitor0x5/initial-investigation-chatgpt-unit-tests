package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
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
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 10);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 10);
        grafo.insereAresta(1, 4, 15);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());
        aresta = grafo.proxAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(10, aresta.peso());
        aresta = grafo.proxAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(4, aresta.v2());
        assertEquals(15, aresta.peso());
        aresta = grafo.proxAdj(1);
        assertNull(aresta);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 10);
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(2, 4, 20);
        grafo.insereAresta(3, 4, 25);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(2, 4, 20);
        grafo.insereAresta(3, 4, 25);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(1, 3));
        assertFalse(grafoT.existeAresta(2, 3));
        assertFalse(grafoT.existeAresta(2, 4));
        assertFalse(grafoT.existeAresta(3, 4));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 2));
        assertTrue(grafoT.existeAresta(4, 3));
    }
}