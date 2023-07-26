package ds;import static org.junit.Assert.*;

import org.junit.Test;

public class GrafoTest9{


    @Test(timeout=1000, expected=Exception.class)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 5));
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 5));
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(10);
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 5);
        assertFalse(grafo.listaAdjVazia(1));
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.primeiroListaAdj(1));
        grafo.insereAresta(1, 2, 5);
        assertNotNull(grafo.primeiroListaAdj(1));
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.proxAdj(1));
        grafo.insereAresta(1, 2, 5);
        assertNotNull(grafo.proxAdj(1));
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        assertNull(grafo.retiraAresta(1, 2));
        grafo.insereAresta(1, 2, 5);
        assertNotNull(grafo.retiraAresta(1, 2));
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        grafo.insereAresta(3, 5, 6);
        grafo.imprime();
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(10);
        assertEquals(10, grafo.numVertices());
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        grafo.insereAresta(3, 5, 6);
        Grafo grafoT = grafo.grafoTransposto();
    }
}