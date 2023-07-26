package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest7{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNotNull(grafo);
    }
    
    @Test(expected=ArrayIndexOutOfBoundsException.class, timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        // Test for exception when exceeding array length
        grafo.insereAresta(2, 3, 15);
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(3, 4));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(3));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        assertNull(grafo.primeiroListaAdj(3));
        
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        assertNull(grafo.proxAdj(3));
        
        Grafo.Aresta aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(5, aresta.peso());
        
        assertNull(grafo.retiraAresta(3, 4));
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(10);
        assertEquals(10, grafo.numVertices());
    }
}