package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest0{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNotNull(grafo.primeiroListaAdj(2));
        assertNull(grafo.primeiroListaAdj(4));
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);
        assertNotNull(grafo.proxAdj(0));
        assertNotNull(grafo.proxAdj(2));
        assertNull(grafo.proxAdj(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);
        grafo.imprime();
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
        grafo = new Grafo(10);
        assertEquals(10, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, 15);
        grafo.insereAresta(3, 4, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}