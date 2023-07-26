package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest4{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);
        grafo.insereAresta(0, 3, 20);
        grafo.insereAresta(0, 4, 25);
        assertEquals(grafo.primeiroListaAdj(0).peso(), 10);
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);
        grafo.insereAresta(0, 3, 20);
        grafo.insereAresta(0, 4, 25);
        assertEquals(grafo.proxAdj(0).peso(), 15);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);
        grafo.insereAresta(0, 3, 20);
        grafo.insereAresta(0, 4, 25);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(grafo.numVertices(), 5);
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertEquals(grafoTransposto.numVertices(), 5);
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
        assertTrue(grafoTransposto.existeAresta(3, 2));
        assertTrue(grafoTransposto.existeAresta(4, 3));
    }
}