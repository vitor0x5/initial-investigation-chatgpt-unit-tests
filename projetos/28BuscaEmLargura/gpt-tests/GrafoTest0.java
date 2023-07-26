package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest0{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);
        grafo.insereAresta(0, 4, 8);
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(4, 0));
        assertFalse(grafo.existeAresta(2, 4));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
        assertTrue(grafo.listaAdjVazia(5));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.primeiroListaAdj(0));
        assertEquals(new Grafo.Aresta(1, 2, 7), grafo.primeiroListaAdj(1));
        assertEquals(new Grafo.Aresta(2, 3, 9), grafo.primeiroListaAdj(2));
        assertEquals(new Grafo.Aresta(3, 4, 3), grafo.primeiroListaAdj(3));
        assertEquals(new Grafo.Aresta(4, 0, 2), grafo.primeiroListaAdj(4));
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.proxAdj(0));
        assertEquals(new Grafo.Aresta(1, 2, 7), grafo.proxAdj(1));
        assertEquals(new Grafo.Aresta(2, 3, 9), grafo.proxAdj(2));
        assertEquals(new Grafo.Aresta(3, 4, 3), grafo.proxAdj(3));
        assertEquals(new Grafo.Aresta(4, 0, 2), grafo.proxAdj(4));
        assertNull(grafo.proxAdj(0));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.retiraAresta(0, 1));
        assertEquals(new Grafo.Aresta(1, 2, 7), grafo.retiraAresta(1, 2));
        assertEquals(new Grafo.Aresta(2, 3, 9), grafo.retiraAresta(2, 3));
        assertEquals(new Grafo.Aresta(3, 4, 3), grafo.retiraAresta(3, 4));
        assertEquals(new Grafo.Aresta(4, 0, 2), grafo.retiraAresta(4, 0));
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        grafo.imprime();
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 7);
        grafo.insereAresta(2, 3, 9);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 2);

        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(new Grafo.Aresta(1, 0, 5), grafoT.primeiroListaAdj(0));
        assertEquals(new Grafo.Aresta(2, 1, 7), grafoT.primeiroListaAdj(1));
        assertEquals(new Grafo.Aresta(3, 2, 9), grafoT.primeiroListaAdj(2));
        assertEquals(new Grafo.Aresta(4, 3, 3), grafoT.primeiroListaAdj(3));
        assertEquals(new Grafo.Aresta(0, 4, 2), grafoT.primeiroListaAdj(4));
    }
}