package ds;import ds.Grafo;
import ds.Grafo.Aresta;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest9{

    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo();
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo();
        grafo.insereAresta(-1, -1, -1);
        grafo.insereAresta(0, 0, 0);
        grafo.insereAresta(1, 1, 1);
        grafo.insereAresta(-1, 0, 1);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, -1, 3);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo();
        assertFalse(grafo.existeAresta(-1, -1));
        assertFalse(grafo.existeAresta(0, 0));
        assertFalse(grafo.existeAresta(1, 1));
        assertFalse(grafo.existeAresta(-1, 0));
        assertFalse(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, -1));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(-1));
        assertTrue(grafo.listaAdjVazia(0));
        assertTrue(grafo.listaAdjVazia(1));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.primeiroListaAdj(-1));
        assertNull(grafo.primeiroListaAdj(0));
        assertNull(grafo.primeiroListaAdj(1));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.proxAdj(-1));
        assertNull(grafo.proxAdj(0));
        assertNull(grafo.proxAdj(1));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo();
        assertNull(grafo.retiraAresta(-1, -1));
        assertNull(grafo.retiraAresta(0, 0));
        assertNull(grafo.retiraAresta(1, 1));
        assertNull(grafo.retiraAresta(-1, 0));
        assertNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, -1));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo();
        grafo.imprime();
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo();
        assertEquals(grafo.numVertices(), 100);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo();
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(grafoT.numVertices(), 100);
    }
}