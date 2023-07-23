package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest2{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 3, 8);
        grafo.insereAresta(3, 4, 3);
        grafo.insereAresta(4, 0, 6);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertTrue(grafo.existeAresta(4, 0));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(3);
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(4);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 4);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 6);
        grafo.insereAresta(0, 2, 8);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        assertEquals(6, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 6);
        grafo.insereAresta(0, 2, 8);
        Grafo.Aresta aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(2, aresta.v2());
        assertEquals(8, aresta.peso());
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 6);
        grafo.insereAresta(0, 2, 8);
        grafo.insereAresta(1, 3, 3);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(6, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 6);
        grafo.insereAresta(0, 2, 8);
        grafo.insereAresta(1, 3, 3);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 0));
        assertTrue(grafoTransposto.existeAresta(3, 1));
    }
}