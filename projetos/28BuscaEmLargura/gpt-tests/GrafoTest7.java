package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Grafo.Aresta;

import org.junit.Ignore;

@Ignore
public class GrafoTest7{


    @Test(expected=Exception.class, timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);

        Aresta aresta = grafo.retiraAresta(1, 2);

        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);

        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);

        Aresta aresta = grafo.primeiroListaAdj(0);

        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);

        grafo.primeiroListaAdj(0);
        Aresta aresta = grafo.proxAdj(0);

        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout=1000)
    public void testRetiraAresta_DefaultConstructor() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);

        try {
            grafo.retiraAresta(0, 1);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 3, 15);

        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);

        assertEquals(5, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
    }
}