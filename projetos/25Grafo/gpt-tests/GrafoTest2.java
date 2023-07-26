package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Grafo;
import ds.Grafo.Aresta;

public class GrafoTest2{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        try {
            Grafo grafo = new Grafo();
            assertNotNull(grafo);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testInsereAresta() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            assertTrue(grafo.existeAresta(0, 1));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testExisteAresta() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            assertTrue(grafo.existeAresta(0, 1));
            assertFalse(grafo.existeAresta(1, 0));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() {
        try {
            Grafo grafo = new Grafo();
            assertTrue(grafo.listaAdjVazia(0));
            grafo.insereAresta(0, 1, 10);
            assertFalse(grafo.listaAdjVazia(0));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            grafo.insereAresta(0, 2, 20);
            grafo.insereAresta(0, 3, 30);
            assertNotNull(grafo.primeiroListaAdj(0));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testProxAdj() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            grafo.insereAresta(0, 2, 20);
            grafo.insereAresta(0, 3, 30);
            assertNotNull(grafo.proxAdj(0));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            Aresta aresta = grafo.retiraAresta(0, 1);
            assertNotNull(aresta);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testImprime() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            grafo.insereAresta(0, 2, 20);
            grafo.insereAresta(0, 3, 30);
            grafo.imprime();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testNumVertices() {
        try {
            Grafo grafo = new Grafo();
            assertEquals(100, grafo.numVertices());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(0, 1, 10);
            grafo.insereAresta(1, 2, 20);
            grafo.insereAresta(2, 3, 30);
            Grafo grafoT = grafo.grafoTransposto();
            assertNotNull(grafoT);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}