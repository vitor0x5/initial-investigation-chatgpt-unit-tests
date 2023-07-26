package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest13{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(1, 4));
        assertFalse(grafo.existeAresta(2, 3));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.insereAresta(2, 0, 30);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 0));
        assertFalse(grafo.existeAresta(0, 2));
        assertFalse(grafo.existeAresta(1, 0));
        assertFalse(grafo.existeAresta(2, 1));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        assertFalse(grafo.listaAdjVazia(0));
        assertFalse(grafo.listaAdjVazia(1));
        assertFalse(grafo.listaAdjVazia(2));
        assertFalse(grafo.listaAdjVazia(3));
        assertTrue(grafo.listaAdjVazia(4));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta2 = grafo.primeiroListaAdj(1);
        Grafo.Aresta aresta3 = grafo.primeiroListaAdj(2);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertNull(aresta3);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(30, aresta2.peso());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        grafo.insereAresta(1, 4, 40);
        Grafo.Aresta aresta1 = grafo.proxAdj(0);
        Grafo.Aresta aresta2 = grafo.proxAdj(1);
        Grafo.Aresta aresta3 = grafo.proxAdj(2);
        Grafo.Aresta aresta4 = grafo.proxAdj(3);
        Grafo.Aresta aresta5 = grafo.proxAdj(4);
        assertNull(aresta1);
        assertNotNull(aresta2);
        assertNull(aresta3);
        assertNull(aresta4);
        assertNull(aresta5);
        assertEquals(1, aresta2.v1());
        assertEquals(4, aresta2.v2());
        assertEquals(40, aresta2.peso());
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        Grafo.Aresta aresta1 = grafo.retiraAresta(0, 1);
        Grafo.Aresta aresta2 = grafo.retiraAresta(1, 3);
        Grafo.Aresta aresta3 = grafo.retiraAresta(2, 3);
        assertNotNull(aresta1);
        assertNotNull(aresta2);
        assertNull(aresta3);
        assertEquals(0, aresta1.v1());
        assertEquals(1, aresta1.v2());
        assertEquals(10, aresta1.peso());
        assertEquals(1, aresta2.v1());
        assertEquals(3, aresta2.v2());
        assertEquals(30, aresta2.peso());
        assertFalse(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(2, 3));
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 2, 30);
        grafo.insereAresta(2, 0, 40);
        grafo.insereAresta(2, 1, 50);
        grafo.imprime();
    }
    
    @Test(timeout=1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertFalse(grafoT.existeAresta(0, 1));
        assertFalse(grafoT.existeAresta(0, 2));
        assertFalse(grafoT.existeAresta(1, 3));
    }
}