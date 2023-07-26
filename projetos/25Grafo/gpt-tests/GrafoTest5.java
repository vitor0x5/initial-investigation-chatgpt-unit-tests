package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        try {
            Grafo grafo = new Grafo();
            assertNotNull(grafo);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testInsereAresta() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            assertTrue(grafo.existeAresta(1, 2));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testExisteAresta() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            assertTrue(grafo.existeAresta(1, 2));
            assertFalse(grafo.existeAresta(2, 1));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() {
        try {
            Grafo grafo = new Grafo();
            assertTrue(grafo.listaAdjVazia(1));
            grafo.insereAresta(1, 2, 10);
            assertFalse(grafo.listaAdjVazia(1));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            grafo.insereAresta(1, 3, 20);
            grafo.insereAresta(1, 4, 30);
            assertNotNull(grafo.primeiroListaAdj(1));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testProxAdj() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            grafo.insereAresta(1, 3, 20);
            grafo.insereAresta(1, 4, 30);
            assertNotNull(grafo.proxAdj(1));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testRetiraAresta() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            assertNotNull(grafo.retiraAresta(1, 2));
            assertNull(grafo.retiraAresta(1, 2));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testImprime() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            grafo.insereAresta(1, 3, 20);
            grafo.insereAresta(1, 4, 30);
            grafo.imprime();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testNumVertices() {
        try {
            Grafo grafo = new Grafo();
            assertEquals(100, grafo.numVertices());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() {
        try {
            Grafo grafo = new Grafo();
            grafo.insereAresta(1, 2, 10);
            grafo.insereAresta(2, 3, 20);
            grafo.insereAresta(3, 1, 30);
            Grafo grafoT = grafo.grafoTransposto();
            assertNotNull(grafoT);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}