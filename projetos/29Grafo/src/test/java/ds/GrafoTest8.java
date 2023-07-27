package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest8{

    
    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    // Test for insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(2, 3, 20);
        grafo.insereAresta(4, 0, 30);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(4, 0));
        
        assertFalse(grafo.existeAresta(0, 3));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(3, 4));
    }
    
    // Test for existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }
    
    // Test for listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }
    
    // Test for primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        
        aresta = grafo.primeiroListaAdj(1);
        assertNull(aresta);
        
        aresta = grafo.primeiroListaAdj(2);
        assertNull(aresta);
    }
    
    // Test for proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        
        grafo.primeiroListaAdj(0);
        
        Grafo.Aresta aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(20, aresta.peso());
        
        aresta = grafo.proxAdj(2);
        assertNull(aresta);
    }
    
    // Test for retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(2, 3, 30);
        
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        
        aresta = grafo.retiraAresta(2, 3);
        assertNotNull(aresta);
        assertEquals(2, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(30, aresta.peso());
        
        aresta = grafo.retiraAresta(0, 1);
        assertNull(aresta);
    }
    
    // Test for grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(2, 3, 30);
        
        Grafo grafoT = grafo.grafoTransposto();
        
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 2));
        
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(2, 3));
    }
}