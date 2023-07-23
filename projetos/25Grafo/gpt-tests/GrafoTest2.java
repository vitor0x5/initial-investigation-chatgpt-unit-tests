package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest2{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
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
        assertNull(grafo.primeiroListaAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.primeiroListaAdj(0));
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        assertNull(grafo.proxAdj(0));
        grafo.insereAresta(0, 1, 5);
        assertNull(grafo.proxAdj(0));
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.retiraAresta(0, 1));
        grafo.insereAresta(0, 1, 5);
        assertNotNull(grafo.retiraAresta(0, 1));
    }

    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo();
        assertEquals(100, grafo.numVertices());
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }

}
