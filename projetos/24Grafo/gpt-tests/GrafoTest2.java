package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Grafo;

public class GrafoTest2{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.primeiroListaAdj(0));
    }
    
    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.proxAdj(0));
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(grafoT.existeAresta(1, 0), true);
        assertEquals(grafoT.existeAresta(2, 1), true);
        assertEquals(grafoT.existeAresta(0, 2), true);
    }
}