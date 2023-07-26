package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest31{


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
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta2 = grafo.proxAdj(1);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertEquals(1, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(20, aresta2.peso());
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertNotNull(aresta);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 1, 50);
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
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 1, 50);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertFalse(grafoT.existeAresta(1, 2));
        assertTrue(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(1, 3));
        assertTrue(grafoT.existeAresta(3, 1));
        assertFalse(grafoT.existeAresta(2, 3));
        assertTrue(grafoT.existeAresta(3, 2));
        assertFalse(grafoT.existeAresta(3, 4));
        assertTrue(grafoT.existeAresta(4, 3));
        assertFalse(grafoT.existeAresta(4, 1));
        assertTrue(grafoT.existeAresta(1, 4));
    }
}