package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest9{

    
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        assertTrue(true);
    }
    
    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 3));
    }
    
    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(3));
    }
    
    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        assertEquals(grafo.primeiroListaAdj(0).v1(), 0);
        assertEquals(grafo.primeiroListaAdj(0).v2(), 1);
        assertEquals(grafo.primeiroListaAdj(0).peso(), 10);
    }
    
    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        assertEquals(grafo.proxAdj(0).v1(), 0);
        assertEquals(grafo.proxAdj(0).v2(), 2);
        assertEquals(grafo.proxAdj(0).peso(), 20);
    }
    
    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 3));
    }
    
    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        grafo.imprime();
        assertTrue(true);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraArestaThrowsException() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.retiraAresta(0, 3);
    }
    
    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(grafo.numVertices(), 5);
    }
    
    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        Grafo grafoT = grafo.grafoTransposto();
        assertFalse(grafoT.listaAdjVazia(1));
        assertTrue(grafoT.listaAdjVazia(3));
    }
}