package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest0{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);
        grafo.insereAresta(1, 2, 20);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(2, 1));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);

        assertFalse(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertNull(aresta2);
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);

        grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta1 = grafo.proxAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(2, aresta1.v2());
        assertEquals(15, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.proxAdj(2);
        assertNull(aresta2);
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);

        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        assertFalse(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));

        Grafo.Aresta aresta2 = grafo.retiraAresta(0, 2);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(15, aresta2.peso());

        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 15);
        grafo.insereAresta(1, 2, 20);

        Grafo grafoT = grafo.grafoTransposto();

        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(1, 2));

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(2, 1));
    }
}