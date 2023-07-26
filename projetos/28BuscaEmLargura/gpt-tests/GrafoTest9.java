package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest9{

    
    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo g = new Grafo(0);
        assertNotNull(g);
    }
    
    // Test for insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        assertTrue(g.existeAresta(0, 1));
        assertFalse(g.existeAresta(0, 2));
    }
    
    // Test for existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        assertTrue(g.existeAresta(0, 1));
        assertFalse(g.existeAresta(0, 2));
    }
    
    // Test for listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo g = new Grafo(3);
        assertTrue(g.listaAdjVazia(0));
        g.insereAresta(0, 1, 2);
        assertFalse(g.listaAdjVazia(0));
    }
    
    // Test for primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        g.insereAresta(0, 2, 3);
        Grafo.Aresta aresta = g.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
    }
    
    // Test for proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        g.insereAresta(0, 2, 3);
        Grafo.Aresta aresta1 = g.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = g.proxAdj(0);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(3, aresta2.peso());
    }
    
    // Test for retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        g.insereAresta(0, 2, 3);
        Grafo.Aresta aresta = g.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(2, aresta.peso());
        assertFalse(g.existeAresta(0, 1));
    }
    
    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        g.insereAresta(0, 2, 3);
        g.imprime();
        // Check printed output manually
    }
    
    // Test for numVertices method
    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo g = new Grafo(3);
        assertEquals(3, g.numVertices());
    }
    
    // Test for grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 2);
        g.insereAresta(0, 2, 3);
        Grafo gt = g.grafoTransposto();
        assertNotNull(gt);
        assertFalse(gt.existeAresta(0, 1));
        assertFalse(gt.existeAresta(0, 2));
        assertTrue(gt.existeAresta(1, 0));
        assertTrue(gt.existeAresta(2, 0));
    }
}
