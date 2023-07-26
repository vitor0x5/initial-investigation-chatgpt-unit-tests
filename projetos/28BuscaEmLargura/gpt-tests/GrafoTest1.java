package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import ds.Grafo.Aresta;

public class GrafoTest1{


    @Test(expected = Exception.class)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(timeout = 1000)
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout = 1000)
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);

        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);

        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.primeiroListaAdj(1);
        Aresta aresta3 = grafo.primeiroListaAdj(2);

        assertNotNull(aresta1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertNull(aresta2);

        assertNull(aresta3);
    }

    @Test(timeout = 1000)
    public void testProxAdj() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);

        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.proxAdj(0);
        Aresta aresta3 = grafo.proxAdj(1);

        assertNotNull(aresta1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertNotNull(aresta2);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());

        assertNull(aresta3);
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);

        Aresta aresta1 = grafo.retiraAresta(0, 1);
        Aresta aresta2 = grafo.retiraAresta(1, 2);
        Aresta aresta3 = grafo.retiraAresta(0, 2);

        assertNotNull(aresta1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertNotNull(aresta2);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());

        assertNull(aresta3);
    }

    @Test(timeout = 1000)
    public void testNumVertices() {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
    }
}