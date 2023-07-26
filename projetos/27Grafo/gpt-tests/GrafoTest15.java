package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest15{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertTrue(grafo.existeAresta(4, 0));

        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(3, 2));
        assertFalse(grafo.existeAresta(4, 3));
        assertFalse(grafo.existeAresta(0, 4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        assertEquals(new Grafo.Aresta(0, 1, 10), grafo.primeiroListaAdj(0));
        assertEquals(new Grafo.Aresta(1, 2, 20), grafo.primeiroListaAdj(1));
        assertEquals(new Grafo.Aresta(2, 3, 30), grafo.primeiroListaAdj(2));
        assertEquals(new Grafo.Aresta(3, 4, 40), grafo.primeiroListaAdj(3));
        assertEquals(new Grafo.Aresta(4, 0, 50), grafo.primeiroListaAdj(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        assertEquals(new Grafo.Aresta(0, 1, 10), grafo.proxAdj(0));
        assertEquals(new Grafo.Aresta(1, 2, 20), grafo.proxAdj(1));
        assertEquals(new Grafo.Aresta(2, 3, 30), grafo.proxAdj(2));
        assertEquals(new Grafo.Aresta(3, 4, 40), grafo.proxAdj(3));
        assertEquals(new Grafo.Aresta(4, 0, 50), grafo.proxAdj(4));

        assertNull(grafo.proxAdj(0));
        assertNull(grafo.proxAdj(1));
        assertNull(grafo.proxAdj(2));
        assertNull(grafo.proxAdj(3));
        assertNull(grafo.proxAdj(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        assertEquals(new Grafo.Aresta(0, 1, 10), grafo.retiraAresta(0, 1));
        assertEquals(new Grafo.Aresta(1, 2, 20), grafo.retiraAresta(1, 2));
        assertEquals(new Grafo.Aresta(2, 3, 30), grafo.retiraAresta(2, 3));
        assertEquals(new Grafo.Aresta(3, 4, 40), grafo.retiraAresta(3, 4));
        assertEquals(new Grafo.Aresta(4, 0, 50), grafo.retiraAresta(4, 0));

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 3));
        assertNull(grafo.retiraAresta(3, 4));
        assertNull(grafo.retiraAresta(4, 0));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertTrue(grafoT.existeAresta(4, 3));
        assertTrue(grafoT.existeAresta(0, 4));

        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(2, 3));
        assertFalse(grafoT.existeAresta(3, 4));
        assertFalse(grafoT.existeAresta(4, 0));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        grafo.imprime();
    }

}
   