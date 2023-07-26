package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest0{

    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertTrue(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(2, 1));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        assertFalse(grafo.listaAdjVazia(1));
        assertTrue(grafo.listaAdjVazia(2));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        Aresta aresta = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Aresta aresta = grafo.primeiroListaAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
        
        aresta = grafo.proxAdj(1);
        assertEquals(1, aresta.v1());
        assertEquals(3, aresta.v2());
        assertEquals(20, aresta.peso());
        
        aresta = grafo.proxAdj(1);
        assertNull(aresta);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        Aresta aresta = grafo.retiraAresta(1, 2);
        assertEquals(1, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(10, aresta.peso());
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        grafo.imprime();
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(1, 3, 20);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(2, 1));
        assertTrue(grafoT.existeAresta(3, 1));
        assertFalse(grafoT.existeAresta(1, 2));
        assertFalse(grafoT.existeAresta(1, 3));
    }
}