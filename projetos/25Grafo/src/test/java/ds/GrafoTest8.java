package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest8{

    
    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }
    
    // Test for the insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        
        assertTrue(grafo.existeAresta(1, 2));
    }
    
    // Test for the existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 3));
    }
    
    // Test for the listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }
    
    // Test for the primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
        
        aresta = grafo.primeiroListaAdj(2);
        assertNull(aresta);
    }
    
    // Test for the proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        aresta = grafo.proxAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(20, aresta.peso());
        
        aresta = grafo.proxAdj(1);
        assertNull(aresta);
    }
    
    // Test for the retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
        
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    // Test for the imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        
        // unable to test output
    }
    
    // Test for the numVertices method
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }
    
    // Test for the grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 20);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }
}