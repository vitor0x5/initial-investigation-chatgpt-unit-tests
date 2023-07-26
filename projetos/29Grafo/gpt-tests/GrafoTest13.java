package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest13{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        assertEquals(1, grafo.primeiroListaAdj(0).v2());
        assertEquals(10, grafo.primeiroListaAdj(0).peso());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        assertEquals(2, grafo.proxAdj(0).v2());
        assertEquals(20, grafo.proxAdj(0).peso());
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
    }
    
    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(2, 4, 40);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}