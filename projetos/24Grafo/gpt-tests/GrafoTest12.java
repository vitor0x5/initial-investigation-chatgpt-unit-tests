package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest12{


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
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.proxAdj(0);
        assertNull(aresta);
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertFalse(grafoT.existeAresta(0, 1));
    }
}