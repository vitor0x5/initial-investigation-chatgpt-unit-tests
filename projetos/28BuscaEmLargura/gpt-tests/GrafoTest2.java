package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest2{

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        grafo.insereAresta(3, 4, 4);
        grafo.insereAresta(4, 0, 5);
    }

    @Test
    public void testExisteAresta() {
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertTrue(grafo.existeAresta(4, 0));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 4));
        assertFalse(grafo.existeAresta(3, 0));
        assertFalse(grafo.existeAresta(4, 1));
    }

    @Test
    public void testListaAdjVazia() {
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo.Aresta aresta0 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(2);
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(3);
        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(4);

        assertNotNull(aresta0);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertNotNull(aresta3);
        assertNotNull(aresta4);

        assertEquals(1, aresta0.v1());
        assertEquals(2, aresta1.v1());
        assertEquals(3, aresta2.v1());
        assertEquals(4, aresta3.v1());
        assertEquals(0, aresta4.v1());

        assertEquals(1, aresta0.v2());
        assertEquals(2, aresta1.v2());
        assertEquals(3, aresta2.v2());
        assertEquals(4, aresta3.v2());
        assertEquals(0, aresta4.v2());
    }

    @Test
    public void testProxAdj() {
        Grafo.Aresta aresta0 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta1 = grafo.proxAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(1);
        Grafo.Aresta aresta3 = grafo.proxAdj(2);
        Grafo.Aresta aresta4 = grafo.proxAdj(3);
        Grafo.Aresta aresta5 = grafo.proxAdj(4);

        assertNotNull(aresta0);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertNotNull(aresta3);
        assertNotNull(aresta4);
        assertNotNull(aresta5);

        assertEquals(1, aresta0.v1());
        assertEquals(0, aresta1.v1());
        assertEquals(2, aresta2.v1());
        assertEquals(3, aresta3.v1());
        assertEquals(4, aresta4.v1());
        assertEquals(0, aresta5.v1());

        assertEquals(1, aresta0.v2());
        assertEquals(2, aresta1.v2());
        assertEquals(3, aresta2.v2());
        assertEquals(4, aresta3.v2());
        assertEquals(0, aresta4.v2());
        assertEquals(1, aresta5.v2());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);
        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
