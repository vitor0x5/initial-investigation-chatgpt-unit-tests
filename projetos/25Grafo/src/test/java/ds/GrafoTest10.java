package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import ds.Grafo;

@RunWith(JUnit4.class)
public class GrafoTest10{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(5, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        // Not testing output format, just checking if method runs without errors
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.imprime();
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
    }
}