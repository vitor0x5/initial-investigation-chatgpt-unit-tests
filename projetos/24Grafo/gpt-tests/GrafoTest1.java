package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest1{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.proxAdj(0);
        assertNotNull(aresta2);
        assertNotEquals(aresta1.v2(), aresta2.v2());
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Grafo transposto = grafo.grafoTransposto();
        assertTrue(transposto.existeAresta(1, 0));
        assertFalse(transposto.existeAresta(0, 1));
    }

}