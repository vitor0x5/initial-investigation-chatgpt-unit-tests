package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class GrafoTest14{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(2, 3, -5);
        grafo.insereAresta(4, 4, 0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(2, 3, -5);
        grafo.insereAresta(4, 4, 0);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(4, 4));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(3, 4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(2, 3, -5);
        grafo.insereAresta(4, 4, 0);
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(4));
        assertTrue(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(3));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, -5);
        grafo.insereAresta(0, 3, 0);
        grafo.insereAresta(4, 4, 5);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(4);
        assertEquals(4, aresta2.v1());
        assertEquals(4, aresta2.v2());
        assertEquals(5, aresta2.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, -5);
        grafo.insereAresta(0, 3, 0);
        grafo.insereAresta(4, 4, 5);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(-5, aresta2.peso());
        Grafo.Aresta aresta3 = grafo.proxAdj(0);
        assertEquals(0, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(0, aresta3.peso());
        Grafo.Aresta aresta4 = grafo.proxAdj(0);
        assertNull(aresta4);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, -5);
        grafo.insereAresta(0, 3, 0);
        grafo.insereAresta(4, 4, 5);
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        Grafo.Aresta aresta2 = grafo.retiraAresta(0, 3);
        assertEquals(0, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(0, aresta2.peso());
        Grafo.Aresta aresta3 = grafo.retiraAresta(0, 2);
        assertEquals(0, aresta3.v1());
        assertEquals(2, aresta3.v2());
        assertEquals(-5, aresta3.peso());
        assertNull(grafo.retiraAresta(0, 1));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, -5);
        grafo.insereAresta(0, 3, 0);
        grafo.insereAresta(4, 4, 5);
        grafo.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
        Grafo grafo2 = new Grafo(0);
        assertEquals(0, grafo2.numVertices());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, -5);
        grafo.insereAresta(0, 3, 0);
        grafo.insereAresta(4, 4, 5);
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(5, grafoT.numVertices());
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 0));
        assertTrue(grafoT.existeAresta(4, 4));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(0, 3));
        assertFalse(grafoT.existeAresta(4, 0));
    }
}