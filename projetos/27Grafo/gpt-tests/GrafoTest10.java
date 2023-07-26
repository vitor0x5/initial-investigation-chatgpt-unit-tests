package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GrafoTest10{


    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(5, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testInsereAresta() {
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout = 1000)
    public void testExisteAresta() {
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() {
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() {
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 5);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() {
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.proxAdj(0));
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() {
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertEquals(5, grafoT.numVertices());
    }
}