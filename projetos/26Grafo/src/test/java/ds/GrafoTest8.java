package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest8{


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
        
        grafo.insereAresta(2, 3, -5);
        assertTrue(grafo.existeAresta(2, 3));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(2, 3, -5);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(2, 3));
        
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
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
        assertNull(grafo.primeiroListaAdj(0));
        
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.primeiroListaAdj(0));
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.proxAdj(0));
        
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.proxAdj(0));
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.retiraAresta(0, 1));
        
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.retiraAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        Grafo transposto = grafo.grafoTransposto();
        assertNotNull(transposto);
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(2, 3, -5);
        
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
}