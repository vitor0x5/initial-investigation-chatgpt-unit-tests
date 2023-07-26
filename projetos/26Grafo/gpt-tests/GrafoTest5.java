package ds;import org.junit.Test;

import ds.Grafo.Aresta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GrafoTest5{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(10);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 4, 30);
        grafo.insereAresta(3, 0, 40);
        grafo.insereAresta(4, 2, 50);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 4, 30);
        grafo.insereAresta(3, 0, 40);
        grafo.insereAresta(4, 2, 50);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertTrue(grafo.existeAresta(3, 0));
        assertTrue(grafo.existeAresta(4, 2));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(3, 4));
        assertFalse(grafo.existeAresta(4, 0));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(30, aresta2.peso());
        Aresta aresta3 = grafo.primeiroListaAdj(2);
        assertEquals(null, aresta3);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        grafo.primeiroListaAdj(0);
        Aresta aresta1 = grafo.proxAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(20, aresta1.peso());
        Aresta aresta2 = grafo.proxAdj(1);
        assertEquals(1, aresta2.v1());
        assertEquals(4, aresta2.v2());
        assertEquals(40, aresta2.peso());
        Aresta aresta3 = grafo.proxAdj(2);
        assertEquals(null, aresta3);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        Aresta aresta2 = grafo.retiraAresta(0, 2);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());
        Aresta aresta3 = grafo.retiraAresta(1, 3);
        assertEquals(1, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(30, aresta3.peso());
        Aresta aresta4 = grafo.retiraAresta(1, 4);
        assertEquals(1, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(40, aresta4.peso());
        Aresta aresta5 = grafo.retiraAresta(0, 1);
        assertEquals(null, aresta5);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 1));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(1, 3));
        assertFalse(grafoT.existeAresta(1, 4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        grafo.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(10);
        assertEquals(10, grafo.numVertices());
        grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
}