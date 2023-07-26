package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest3{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    // Test for insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
    }

    // Test for existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    // Test for listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
    }

    // Test for primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNull(grafo.primeiroListaAdj(1));
    }

    // Test for proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        assertNotNull(grafo.proxAdj(0));
        assertNull(grafo.proxAdj(2));
    }

    // Test for retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 2));
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.imprime();
    }

    // Test for numVertices method
    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    // Test for grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}