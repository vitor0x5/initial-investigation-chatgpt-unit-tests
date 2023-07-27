package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta adj = grafo.primeiroListaAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(10, adj.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        Grafo.Aresta adj = grafo.primeiroListaAdj(0);
        assertNotNull(adj);
        adj = grafo.proxAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(2, adj.v2());
        assertEquals(20, adj.peso());
        adj = grafo.proxAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(3, adj.v2());
        assertEquals(30, adj.peso());
        adj = grafo.proxAdj(0);
        assertNull(adj);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 2);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(20, aresta.peso());
        assertFalse(grafo.existeAresta(0, 2));
        assertNull(grafo.retiraAresta(0, 4));
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 3, 40);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }
}