package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest17{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 2);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertNotNull(aresta2);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(3, aresta2.peso());
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 4);
        grafo.imprime();
        // manually check the output
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertFalse(grafoT.existeAresta(0, 1));
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(2, 1));
    }
}