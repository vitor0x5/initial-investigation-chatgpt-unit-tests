package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest15{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    // Test for insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    // Test for existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    // Test for listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    // Test for primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    // Test for proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    // Test for retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        grafo.imprime();
    }

    // Test for numVertices method
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }

    // Test for grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertFalse(grafoT.existeAresta(0, 1));
        assertTrue(grafoT.existeAresta(1, 0));
    }
}