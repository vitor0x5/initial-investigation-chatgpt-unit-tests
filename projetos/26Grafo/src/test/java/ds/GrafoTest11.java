package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest11{

    
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNotNull(grafo);
    }
    
    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }
    
    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        Grafo.Aresta adj = grafo.primeiroListaAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(10, adj.peso());
    }
    
    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta adj = grafo.primeiroListaAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(1, adj.v2());
        assertEquals(10, adj.peso());
        adj = grafo.proxAdj(0);
        assertNotNull(adj);
        assertEquals(0, adj.v1());
        assertEquals(2, adj.v2());
        assertEquals(20, adj.peso());
        adj = grafo.proxAdj(0);
        assertNull(adj);
    }
    
    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.imprime();
    }
    
    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}