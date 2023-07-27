package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertNotNull(aresta2);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
        assertFalse(grafoTransposto.existeAresta(0, 1));
    }
}