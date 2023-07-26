package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest17{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 10);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertEquals(1, grafo.primeiroListaAdj(2).v1());
        assertEquals(2, grafo.primeiroListaAdj(2).v2());
        assertEquals(10, grafo.primeiroListaAdj(2).peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 5);
        assertEquals(1, grafo.proxAdj(2).v1());
        assertEquals(3, grafo.proxAdj(2).v2());
        assertEquals(5, grafo.proxAdj(2).peso());
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 5);
        assertNotNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 1));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 5);
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
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 5);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertTrue(grafoTransposto.existeAresta(2, 1));
        assertTrue(grafoTransposto.existeAresta(3, 2));
    }
}