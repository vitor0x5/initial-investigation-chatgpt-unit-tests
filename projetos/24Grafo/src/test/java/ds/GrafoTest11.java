package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;
import ds.Aresta;

public class GrafoTest11{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.proxAdj(0);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertNotEquals(aresta1, aresta2);
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.imprime(); // Not testable in JUnit
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
    }
}