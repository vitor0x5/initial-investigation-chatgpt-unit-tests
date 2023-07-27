package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;

public class GrafoTest19{


    @Test( timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
        assertNotNull(grafo);
    }

    @Test( timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test( timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 3));
    }

    @Test( timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 5);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test( timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 3);
        assertNotNull(grafo.primeiroListaAdj(1));
    }

    @Test( timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 3);
        assertNotNull(grafo.proxAdj(1));
    }

    @Test( timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        assertTrue(grafo.existeAresta(1, 2));
        assertNotNull(grafo.retiraAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test( timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 3);
        grafo.imprime();
    }

    @Test( timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }

    @Test( timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 3);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}