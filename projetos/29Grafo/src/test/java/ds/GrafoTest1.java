package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest1{


    @Test
    public void testDefaultConstructor() {
        try {
            Grafo grafo = new Grafo(5);
            assertNotNull(grafo);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testInsereAresta() {
        try {
            Grafo grafo = new Grafo(5);
            grafo.insereAresta(0, 1, 5);
            grafo.insereAresta(1, 2, 3);
            grafo.insereAresta(2, 3, 2);
            grafo.insereAresta(3, 4, 1);
            assertTrue(grafo.existeAresta(0, 1));
            assertTrue(grafo.existeAresta(1, 2));
            assertTrue(grafo.existeAresta(2, 3));
            assertTrue(grafo.existeAresta(3, 4));
            assertFalse(grafo.existeAresta(0, 2));
            assertFalse(grafo.existeAresta(1, 3));
            assertFalse(grafo.existeAresta(2, 4));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() {
        try {
            Grafo grafo = new Grafo(5);
            grafo.insereAresta(0, 1, 5);
            assertFalse(grafo.listaAdjVazia(0));
            assertTrue(grafo.listaAdjVazia(1));
            assertTrue(grafo.listaAdjVazia(2));
            assertTrue(grafo.listaAdjVazia(3));
            assertTrue(grafo.listaAdjVazia(4));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() {
        try {
            Grafo grafo = new Grafo(5);
            grafo.insereAresta(0, 1, 5);
            grafo.insereAresta(0, 2, 3);
            grafo.insereAresta(0, 3, 2);
            grafo.insereAresta(0, 4, 1);
            Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
            assertNotNull(aresta);
            assertEquals(0, aresta.v1());
            assertEquals(1, aresta.v2());
            assertEquals(5, aresta.peso());
            assertNull(grafo.primeiroListaAdj(1));
            assertNull(grafo.primeiroListaAdj(2));
            assertNull(grafo.primeiroListaAdj(3));
            assertNull(grafo.primeiroListaAdj(4));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testProxAdj() {
        try {
            Grafo grafo = new Grafo(5);
            grafo.insereAresta(0, 1, 5);
            grafo.insereAresta(0, 2, 3);
            grafo.insereAresta(0, 3, 2);
            grafo.insereAresta(0, 4, 1);
            Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
            Grafo.Aresta aresta2 = grafo.proxAdj(0);
            Grafo.Aresta aresta3 = grafo.proxAdj(0);
            Grafo.Aresta aresta4 = grafo.proxAdj(0);
            assertNull(grafo.proxAdj(0));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() {
        try {
            Grafo grafo = new Grafo(5);
            grafo.insereAresta(0, 1, 5);
            grafo.insereAresta(1, 2, 3);
            grafo.insereAresta(2, 3, 2);
            grafo.insereAresta(3, 4, 1);
            Grafo grafoTransposto = grafo.grafoTransposto();
            assertTrue(grafoTransposto.existeAresta(1, 0));
            assertTrue(grafoTransposto.existeAresta(2, 1));
            assertTrue(grafoTransposto.existeAresta(3, 2));
            assertTrue(grafoTransposto.existeAresta(4, 3));
            assertFalse(grafoTransposto.existeAresta(0, 1));
            assertFalse(grafoTransposto.existeAresta(1, 2));
            assertFalse(grafoTransposto.existeAresta(2, 3));
            assertFalse(grafoTransposto.existeAresta(3, 4));
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

}