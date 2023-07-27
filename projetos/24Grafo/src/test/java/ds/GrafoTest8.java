package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Grafo;

public class GrafoTest8{


    @Test( timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
    }

    @Test( timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
    }

    @Test( timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
    }

    @Test( timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(1));
        grafo.insereAresta(1, 2, 3);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test( timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        assertNotNull(grafo.primeiroListaAdj(1));
    }

    @Test( timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        assertNotNull(grafo.primeiroListaAdj(1));
        assertNotNull(grafo.proxAdj(1));
        assertNull(grafo.proxAdj(1));
    }

    @Test( timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        assertTrue(grafo.existeAresta(1, 2));
        assertNotNull(grafo.retiraAresta(1, 2));
        assertFalse(grafo.existeAresta(1, 2));
        assertNull(grafo.retiraAresta(1, 2));
    }

    @Test( timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.imprime();
    }

    @Test( timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
    }
}