package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import ds.Grafo;
import ds.Grafo.Aresta;

public class GrafoTest7{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertEquals(0, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
        assertEquals(3, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(0, 2));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(2);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(1, aresta.peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(0, 3, 3);
        Aresta aresta1 = grafo.primeiroListaAdj(0);
        Aresta aresta2 = grafo.proxAdj(0);
        Aresta aresta3 = grafo.proxAdj(0);
        assertNull(aresta3);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(1, aresta1.peso());
        assertEquals(0, aresta2.v1());
        assertEquals(2, aresta2.v2());
        assertEquals(2, aresta2.peso());
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(1, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }
    
    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
    }
}