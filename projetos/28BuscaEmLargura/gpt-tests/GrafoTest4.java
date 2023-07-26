package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest4{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 2);
        grafo.insereAresta(4, 0, 12);
        grafo.insereAresta(4, 1, 7);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 2);
        grafo.insereAresta(4, 0, 12);
        grafo.insereAresta(4, 1, 7);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertTrue(grafo.existeAresta(4, 0));
        assertTrue(grafo.existeAresta(4, 1));

        assertFalse(grafo.existeAresta(0, 3));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(3, 0));
        assertFalse(grafo.existeAresta(4, 3));
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

        grafo.insereAresta(4, 0, 12);
        assertFalse(grafo.listaAdjVazia(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 2);
        grafo.insereAresta(4, 0, 12);
        grafo.insereAresta(4, 1, 7);

        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        aresta = grafo.primeiroListaAdj(3);
        assertNotNull(aresta);
        assertEquals(3, aresta.v1());
        assertEquals(4, aresta.v2());
        assertEquals(2, aresta.peso());

        aresta = grafo.primeiroListaAdj(4);
        assertNotNull(aresta);
        assertEquals(4, aresta.v1());
        assertEquals(0, aresta.v2());
        assertEquals(12, aresta.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 2);
        grafo.insereAresta(4, 0, 12);
        grafo.insereAresta(4, 1, 7);

        grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());

        grafo.primeiroListaAdj(3);
        aresta = grafo.proxAdj(3);
        assertNotNull(aresta);
        assertEquals(3, aresta.v1());
        assertEquals(4, aresta.v2());
        assertEquals(2, aresta.peso());

        grafo.primeiroListaAdj(4);
        aresta = grafo.proxAdj(4);
        assertNotNull(aresta);
        assertEquals(4, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(7, aresta.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 2);
        grafo.insereAresta(4, 0, 12);
        grafo.insereAresta(4, 1, 7);

        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());

        aresta = grafo.retiraAresta(2, 3);
        assertNotNull(aresta);
        assertEquals(2, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(3, aresta.peso());

        aresta = grafo.retiraAresta(4, 0);
        assertNotNull(aresta);
        assertEquals(4, aresta.v1());
        assertEquals(0, aresta.v2());
        assertEquals(12, aresta.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 2);
        grafo.insereAresta(4, 0, 12);
        grafo.insereAresta(4, 1, 7);

        grafo.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }

}