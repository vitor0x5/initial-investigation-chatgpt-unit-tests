package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest8{


    // Test default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    // Test insereAresta method
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);

        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));

        grafo.insereAresta(1, 2, 7);
        assertTrue(grafo.existeAresta(1, 2));

        grafo.insereAresta(2, 0, 3);
        assertTrue(grafo.existeAresta(2, 0));
    }

    // Test existeAresta method
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);

        assertFalse(grafo.existeAresta(0, 1));

        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));

        assertFalse(grafo.existeAresta(1, 0));

        grafo.insereAresta(1, 2, 7);
        assertTrue(grafo.existeAresta(1, 2));
    }

    // Test listaAdjVazia method
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);

        assertTrue(grafo.listaAdjVazia(0));

        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
    }

    // Test primeiroListaAdj method
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);

        assertNull(grafo.primeiroListaAdj(0));

        grafo.insereAresta(0, 1, 5);
        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.primeiroListaAdj(0));

        grafo.insereAresta(0, 2, 3);
        assertEquals(new Grafo.Aresta(0, 2, 3), grafo.primeiroListaAdj(0));
    }

    // Test proxAdj method
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);

        assertNull(grafo.proxAdj(0));

        grafo.insereAresta(0, 1, 5);
        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.primeiroListaAdj(0));
        assertNull(grafo.proxAdj(0));

        grafo.insereAresta(0, 2, 3);
        assertEquals(new Grafo.Aresta(0, 2, 3), grafo.primeiroListaAdj(0));
        assertNull(grafo.proxAdj(0));
    }

    // Test retiraAresta method
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);

        assertNull(grafo.retiraAresta(0, 1));

        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.retiraAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 1));
    }

    // Test grafoTransposto method
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);

        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertEquals(0, grafoT.numVertices());

        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 0, 3);

        grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertEquals(3, grafoT.numVertices());
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(0, 2));
    }

    // Test imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        // Unable to test System.out.println()
    }

    // Test numVertices method
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(0);
        assertEquals(0, grafo.numVertices());

        grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
}
