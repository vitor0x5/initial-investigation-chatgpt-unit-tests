package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest21{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 1));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);

        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());

        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());

        assertNull(aresta3);
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);

        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());

        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());

        assertNull(aresta3);

        aresta1 = grafo.proxAdj(0);
        aresta2 = grafo.proxAdj(1);
        aresta3 = grafo.proxAdj(2);

        assertNull(aresta1);
        assertNull(aresta2);
        assertNull(aresta3);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);

        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());

        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        grafo.imprime();
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
    }
}