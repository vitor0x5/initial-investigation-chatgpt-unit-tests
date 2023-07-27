package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest27{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 0));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(15, aresta2.peso());
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        assertNull(aresta3);
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());
        Grafo.Aresta aresta3 = grafo.proxAdj(0);
        assertNull(aresta3);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(5, aresta1.peso());
        assertFalse(grafo.existeAresta(0, 1));
        Grafo.Aresta aresta2 = grafo.retiraAresta(0, 2);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(10, aresta2.peso());
        assertFalse(grafo.existeAresta(0, 2));
        Grafo.Aresta aresta3 = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta3.v1());
        assertEquals(2, aresta3.v2());
        assertEquals(15, aresta3.peso());
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(1, 2));
    }
}