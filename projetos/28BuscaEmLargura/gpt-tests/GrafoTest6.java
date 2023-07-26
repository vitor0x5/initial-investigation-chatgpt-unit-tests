package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertFalse(grafo.existeAresta(0, 3));
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 1);
        assertNotNull(grafo.primeiroListaAdj(0));
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 1);
        assertNotNull(grafo.proxAdj(0));
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 1);
        assertNotNull(grafo.retiraAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 2));
        assertFalse(grafoT.existeAresta(3, 0));
        assertFalse(grafoT.existeAresta(2, 1));
    }
}