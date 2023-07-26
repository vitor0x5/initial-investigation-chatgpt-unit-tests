package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest0{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 0));
    }

    @Test(timeout=1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 0));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(aresta1.v1(), 0);
        assertEquals(aresta1.v2(), 1);
        assertEquals(aresta1.peso(), 5);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertNull(aresta2);
    }

    @Test(timeout=1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(aresta1.v1(), 0);
        assertEquals(aresta1.v2(), 1);
        assertEquals(aresta1.peso(), 5);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(aresta2.v1(), 0);
        assertEquals(aresta2.v2(), 2);
        assertEquals(aresta2.peso(), 10);
        Grafo.Aresta aresta3 = grafo.proxAdj(0);
        assertNull(aresta3);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(aresta1.v1(), 0);
        assertEquals(aresta1.v2(), 1);
        assertEquals(aresta1.peso(), 5);
        assertFalse(grafo.existeAresta(0, 1));
        Grafo.Aresta aresta2 = grafo.retiraAresta(0, 2);
        assertEquals(aresta2.v1(), 0);
        assertEquals(aresta2.v2(), 2);
        assertEquals(aresta2.peso(), 10);
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout=1000)
    public void testImprime() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(3);
        assertEquals(grafo.numVertices(), 3);
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
    }
}