package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest12{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.primeiroListaAdj(0));
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.proxAdj(0));
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 2, 30);
        grafo.insereAresta(2, 0, 40);
        grafo.insereAresta(2, 1, 50);
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 2, 30);
        grafo.insereAresta(2, 0, 40);
        grafo.insereAresta(2, 1, 50);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}