package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest20{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

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

    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertFalse(grafo.listaAdjVazia(4));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(30, aresta3.peso());

        Grafo.Aresta aresta4 = grafo.primeiroListaAdj(3);
        assertEquals(3, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(40, aresta4.peso());

        Grafo.Aresta aresta5 = grafo.primeiroListaAdj(4);
        assertEquals(4, aresta5.v1());
        assertEquals(0, aresta5.v2());
        assertEquals(50, aresta5.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(0);
        assertEquals(0, aresta2.v1());
        assertEquals(1, aresta2.v2());
        assertEquals(10, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta4 = grafo.proxAdj(1);
        assertEquals(1, aresta4.v1());
        assertEquals(2, aresta4.v2());
        assertEquals(20, aresta4.peso());

        Grafo.Aresta aresta5 = grafo.primeiroListaAdj(2);
        Grafo.Aresta aresta6 = grafo.proxAdj(2);
        assertEquals(2, aresta6.v1());
        assertEquals(3, aresta6.v2());
        assertEquals(30, aresta6.peso());

        Grafo.Aresta aresta7 = grafo.primeiroListaAdj(3);
        Grafo.Aresta aresta8 = grafo.proxAdj(3);
        assertEquals(3, aresta8.v1());
        assertEquals(4, aresta8.v2());
        assertEquals(40, aresta8.peso());

        Grafo.Aresta aresta9 = grafo.primeiroListaAdj(4);
        Grafo.Aresta aresta10 = grafo.proxAdj(4);
        assertEquals(4, aresta10.v1());
        assertEquals(0, aresta10.v2());
        assertEquals(50, aresta10.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 3, 30);
        grafo.insereAresta(3, 4, 40);
        grafo.insereAresta(4, 0, 50);

        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());

        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(20, aresta2.peso());

        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
        assertEquals(2, aresta3.v1());
        assertEquals(3, aresta3.v2());
        assertEquals(30, aresta3.peso());

        Grafo.Aresta aresta4 = grafo.retiraAresta(3, 4);
        assertEquals(3, aresta4.v1());
        assertEquals(4, aresta4.v2());
        assertEquals(40, aresta4.peso());

        Grafo.Aresta aresta5 = grafo.retiraAresta(4, 0);
        assertEquals(4, aresta5.v1());
        assertEquals(0, aresta5.v2());
        assertEquals(50, aresta5.peso());
    }

}