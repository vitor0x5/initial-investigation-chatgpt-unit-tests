package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest10{

    
    @Test(expected = Exception.class)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        assertFalse(grafo.existeAresta(0, 1));
        
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.primeiroListaAdj(0));
        
        grafo.insereAresta(0, 1, 1);
        assertNotNull(grafo.primeiroListaAdj(0));
    }
    
    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.proxAdj(0));
        
        grafo.insereAresta(0, 1, 1);
        assertNull(grafo.proxAdj(0));
    }
    
    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.retiraAresta(0, 1));
        
        grafo.insereAresta(0, 1, 1);
        assertNotNull(grafo.retiraAresta(0, 1));
    }
    
    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(5, grafoT.numVertices());
        
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        
        grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
    }
    
}