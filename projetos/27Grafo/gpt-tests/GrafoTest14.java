package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Grafo.Aresta;

public class GrafoTest14{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 2);
        
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        
        aresta = grafo.primeiroListaAdj(1);
        assertNull(aresta);
    }
    
    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 2);
        
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        
        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(2, aresta.peso());
        
        aresta = grafo.proxAdj(0);
        assertNull(aresta);
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 2);
        
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 2);
        
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 2);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}