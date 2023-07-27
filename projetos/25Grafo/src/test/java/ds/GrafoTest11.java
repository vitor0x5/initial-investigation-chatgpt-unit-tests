package ds;import ds.Grafo;
import ds.Grafo.Aresta;
import ds.Lista;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest11{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        try {
            Grafo grafo = new Grafo();
            assertNotNull(grafo);
            assertEquals(100, grafo.numVertices());
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
            assertNull(grafo.primeiroListaAdj(0));
            grafo.insereAresta(0, 1, 10);
            Aresta aresta = grafo.primeiroListaAdj(0);
            assertNotNull(aresta);
            assertEquals(0, aresta.v1());
            assertEquals(1, aresta.v2());
            assertEquals(10, aresta.peso());
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testProxAdj() {
        try {
            Grafo grafo = new Grafo();
            assertNull(grafo.proxAdj(0));
            grafo.insereAresta(0, 1, 10);
            grafo.insereAresta(0, 2, 20);
            Aresta aresta1 = grafo.primeiroListaAdj(0);
            assertNotNull(aresta1);
            assertEquals(0, aresta1.v1());
            assertEquals(1, aresta1.v2());
            assertEquals(10, aresta1.peso());
            Aresta aresta2 = grafo.proxAdj(0);
            assertNotNull(aresta2);
            assertEquals(0, aresta2.v1());
            assertEquals(2, aresta2.v2());
            assertEquals(20, aresta2.peso());
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
            assertEquals(0, aresta.v1());
            assertEquals(1, aresta.v2());
            assertEquals(10, aresta.peso());
            assertFalse(grafo.existeAresta(0, 1));
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
            grafo.insereAresta(1, 0, 20);
            Grafo grafoT = grafo.grafoTransposto();
            assertTrue(grafoT.existeAresta(1, 0));
            assertTrue(grafoT.existeAresta(0, 1));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}