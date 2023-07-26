package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import ds.Grafo;

public class GrafoTest15{

    
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    
    @Test
    public void testDefaultConstructor() {
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }
    
    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(4);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        assertNotNull(grafo.primeiroListaAdj(0));
        assertNull(grafo.primeiroListaAdj(1));
    }
    
    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        assertNotNull(grafo.proxAdj(0));
        assertNull(grafo.proxAdj(3));
    }
    
    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertNull(grafo.retiraAresta(1, 0));
    }
    
    @Test
    public void testImprime() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        grafo.imprime();
    }
    
    @Test
    public void testNumVertices() {
        Grafo grafo = new Grafo(4);
        assertEquals(4, grafo.numVertices());
    }
    
    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(0, 3, 15);
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
    }
}