package ds;import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class GrafoTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }

    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(3, 4));
    }

    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(3, 4));
    }

    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertTrue(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
    }

    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(3);

        assertEquals(aresta1.v1(), 0);
        assertEquals(aresta1.v2(), 1);
        assertEquals(aresta1.peso(), 5);

        assertEquals(aresta2.v1(), 1);
        assertEquals(aresta2.v2(), 2);
        assertEquals(aresta2.peso(), 10);

        assertEquals(aresta3.v1(), 2);
        assertEquals(aresta3.v2(), 3);
        assertEquals(aresta3.peso(), -15);

        assertNull(aresta4);
    }

    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        Grafo.Aresta aresta3 = grafo.proxAdj(1);
        Grafo.Aresta aresta4 = grafo.proxAdj(2);
        Grafo.Aresta aresta5 = grafo.proxAdj(3);

        assertEquals(aresta1.v1(), 0);
        assertEquals(aresta1.v2(), 1);
        assertEquals(aresta1.peso(), 5);

        assertEquals(aresta2.v1(), 0);
        assertEquals(aresta2.v2(), 1);
        assertEquals(aresta2.peso(), 5);

        assertEquals(aresta3.v1(), 1);
        assertEquals(aresta3.v2(), 2);
        assertEquals(aresta3.peso(), 10);

        assertEquals(aresta4.v1(), 2);
        assertEquals(aresta4.v2(), 3);
        assertEquals(aresta4.peso(), -15);

        assertNull(aresta5);
    }

    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);
        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
        Grafo.Aresta aresta4 = grafo.retiraAresta(3, 4);

        assertEquals(aresta1.v1(), 0);
        assertEquals(aresta1.v2(), 1);
        assertEquals(aresta1.peso(), 5);

        assertEquals(aresta2.v1(), 1);
        assertEquals(aresta2.v2(), 2);
        assertEquals(aresta2.peso(), 10);

        assertEquals(aresta3.v1(), 2);
        assertEquals(aresta3.v2(), 3);
        assertEquals(aresta3.peso(), -15);

        assertNull(aresta4);
    }

    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);

        Grafo grafoT = grafo.grafoTransposto();

        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 2));
        assertFalse(grafoT.existeAresta(4, 3));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 3, -15);
        grafo.insereAresta(3, 4, 20);

        // Redirect System.out to check output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        grafo.imprime();

        String expectedOutput = "Vertice 0:\n  1 (5)\nVertice 1:\n  2 (10)\nVertice 2:\n  3 (-15)\nVertice 3:\n  4 (20)\nVertice 4:\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(grafo.numVertices(), 5);
    }
}