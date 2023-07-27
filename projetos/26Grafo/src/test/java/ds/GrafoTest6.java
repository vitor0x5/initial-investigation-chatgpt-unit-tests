package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest6{

    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        assertTrue(grafo.existeAresta(v1, v2));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        assertTrue(grafo.existeAresta(v1, v2));
        assertFalse(grafo.existeAresta(v2, v1));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        int v = 0;
        assertTrue(grafo.listaAdjVazia(v));
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        assertFalse(grafo.listaAdjVazia(v));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(v1);
        assertNotNull(aresta);
        assertEquals(v1, aresta.v1());
        assertEquals(v2, aresta.v2());
        assertEquals(peso, aresta.peso());
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(v1);
        assertNotNull(aresta);
        assertEquals(v1, aresta.v1());
        assertEquals(v2, aresta.v2());
        assertEquals(peso, aresta.peso());
        aresta = grafo.proxAdj(v1);
        assertNull(aresta);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        Grafo.Aresta aresta = grafo.retiraAresta(v1, v2);
        assertNotNull(aresta);
        assertEquals(v1, aresta.v1());
        assertEquals(v2, aresta.v2());
        assertEquals(peso, aresta.peso());
        assertFalse(grafo.existeAresta(v1, v2));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
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
        int v1 = 0;
        int v2 = 1;
        int peso = 10;
        grafo.insereAresta(v1, v2, peso);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(v2, v1));
    }
}