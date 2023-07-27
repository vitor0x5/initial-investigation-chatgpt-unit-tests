package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest10{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo graph = new Grafo(5);
        assertNotNull(graph);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 10);
        assertTrue(graph.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo graph = new Grafo(5);
        assertFalse(graph.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo graph = new Grafo(5);
        assertTrue(graph.listaAdjVazia(0));
        graph.insereAresta(0, 1, 10);
        assertFalse(graph.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 10);
        graph.insereAresta(0, 2, 20);
        Grafo.Aresta firstAdj = graph.primeiroListaAdj(0);
        assertNotNull(firstAdj);
        assertEquals(0, firstAdj.v1());
        assertEquals(1, firstAdj.v2());
        assertEquals(10, firstAdj.peso());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 10);
        graph.insereAresta(0, 2, 20);
        graph.insereAresta(0, 3, 30);
        Grafo.Aresta firstAdj = graph.primeiroListaAdj(0);
        Grafo.Aresta nextAdj = graph.proxAdj(0);
        assertNotNull(nextAdj);
        assertEquals(0, nextAdj.v1());
        assertEquals(2, nextAdj.v2());
        assertEquals(20, nextAdj.peso());
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 10);
        graph.insereAresta(0, 2, 20);
        graph.insereAresta(0, 3, 30);
        Grafo.Aresta removedAresta = graph.retiraAresta(0, 2);
        assertNotNull(removedAresta);
        assertEquals(0, removedAresta.v1());
        assertEquals(2, removedAresta.v2());
        assertEquals(20, removedAresta.peso());
        assertFalse(graph.existeAresta(0, 2));
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 10);
        graph.insereAresta(0, 2, 20);
        graph.insereAresta(0, 3, 30);
        graph.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo graph = new Grafo(5);
        assertEquals(5, graph.numVertices());
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo graph = new Grafo(5);
        graph.insereAresta(0, 1, 10);
        graph.insereAresta(0, 2, 20);
        graph.insereAresta(0, 3, 30);
        Grafo transposedGraph = graph.grafoTransposto();
        assertTrue(transposedGraph.existeAresta(1, 0));
        assertTrue(transposedGraph.existeAresta(2, 0));
        assertTrue(transposedGraph.existeAresta(3, 0));
    }
}