package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo.Aresta;

public class GrafoTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        assertTrue(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(0, 3, 30);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(0, 3, 30);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.primeiroListaAdj(1);
        Aresta aresta3 = grafo.proxAdj(0);
        Aresta aresta4 = grafo.proxAdj(1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());
        assertEquals(0, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(30, aresta3.peso());
        assertNull(aresta4);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        Aresta aresta1 = grafo.retiraAresta(0, 1);
        Aresta aresta2 = grafo.retiraAresta(1, 2);
        assertNull(aresta1);
        assertNotNull(aresta2);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(0, 3, 30);
        grafo.imprime();
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(0, 3, 30);
        Grafo grafoT = grafo.grafoTransposto();
        Aresta aresta1 = grafoT.primeiroListaAdj(1);
        Aresta aresta2 = grafoT.primeiroListaAdj(2);
        Aresta aresta3 = grafoT.primeiroListaAdj(3);
        assertEquals(1, aresta1.v1());
        assertEquals(0, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(2, aresta2.v1());
        assertEquals(1, aresta2.v2());
        assertEquals(20, aresta2.peso());
        assertEquals(3, aresta3.v1());
        assertEquals(0, aresta3.v2());
        assertEquals(30, aresta3.peso());
    }
}