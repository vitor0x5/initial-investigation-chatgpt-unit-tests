package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest14{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    // Test for insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
    }

    // Test for existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }

    // Test for listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    // Test for primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    // Test for proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(20, aresta.peso());
    }

    // Test for retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.imprime();
        // Output should be: "Vertice 0:\n  1 (10)\n  2 (20)\n"
    }

    // Test for numVertices method
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    // Test for grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
    }
}