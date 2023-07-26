package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest4{


    @Test(expected=Exception.class, timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(3, 4, 20);
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 3));
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
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(1, 4, 30);
        Grafo.Aresta aresta = grafo.proxAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(20, aresta.peso());
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo.Aresta aresta = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.insereAresta(2, 3, 30);
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
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 1));
    }
}