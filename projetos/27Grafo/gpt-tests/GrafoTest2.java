package ds;package ds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest2{


    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 4);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 4, 3);
        grafo.insereAresta(2, 0, 1);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(3, 4, 1);
        grafo.insereAresta(4, 0, 3);
    }

    @Test
    public void testeInsereAresta() {
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 3));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(1, 4));
        assertTrue(grafo.existeAresta(2, 0));
        assertTrue(grafo.existeAresta(2, 3));
        assertTrue(grafo.existeAresta(3, 4));
        assertTrue(grafo.existeAresta(4, 0));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 1));
        assertFalse(grafo.existeAresta(3, 0));
        assertFalse(grafo.existeAresta(4, 2));
    }

    @Test
    public void testeListaAdjVazia() {
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
    }

    @Test
    public void testePrimeiroListaAdj() {
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(1, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        assertEquals(2, aresta3.v1());
        assertEquals(0, aresta3.v2());
        assertEquals(1, aresta3.peso());

        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(3);
        assertEquals(3, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(1, aresta4.peso());

        Grafo.Aresta aresta5 = grafo.primeiroListaAdj(4);
        assertEquals(4, aresta5.v1());
        assertEquals(0, aresta5.v2());
        assertEquals(3, aresta5.peso());
    }

    @Test
    public void testeProxAdj() {
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());
        assertNull(aresta2);

        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta4 = grafo.proxAdj(1);
        assertEquals(1, aresta3.v1());
        assertEquals(2, aresta3.v2());
        assertEquals(1, aresta3.peso());
        assertEquals(1, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(3, aresta4.peso());
        assertNull(grafo.proxAdj(1));

        Grafo.Aresta aresta5 = grafo.primeiroListaAdj(2);
        Grafo.Aresta aresta6 = grafo.proxAdj(2);
        assertEquals(2, aresta5.v1());
        assertEquals(0, aresta5.v2());
        assertEquals(1, aresta5.peso());
        assertEquals(2, aresta6.v1());
        assertEquals(3, aresta6.v2());
        assertEquals(2, aresta6.peso());
        assertNull(grafo.proxAdj(2));

        Grafo.Aresta aresta7 = grafo.primeiroListaAdj(3);
        Grafo.Aresta aresta8 = grafo.proxAdj(3);
        assertEquals(3, aresta7.v1());
        assertEquals(4, aresta7.v2());
        assertEquals(1, aresta7.peso());
        assertNull(aresta8);

        Grafo.Aresta aresta9 = grafo.primeiroListaAdj(4);
        Grafo.Aresta aresta10 = grafo.proxAdj(4);
        assertEquals(4, aresta9.v1());
        assertEquals(0, aresta9.v2());
        assertEquals(3, aresta9.peso());
        assertNull(aresta10);
    }

    @Test
    public void testeRetiraAresta() throws Exception {
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(2, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(1, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(2, aresta3.peso());

        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 3));
    }

    @Test
    public void testeGrafoTransposto() {
        Grafo grafoTransposto = grafo.grafoTransposto();

        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(3, 0));
        assertTrue(grafoTrans