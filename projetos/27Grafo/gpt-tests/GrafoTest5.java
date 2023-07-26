package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0); // Invalid input
        assertEquals(0, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        assertEquals(true, grafo.existeAresta(0, 1));
        assertEquals(true, grafo.existeAresta(1, 2));
        assertEquals(true, grafo.existeAresta(2, 0));
        assertEquals(false, grafo.existeAresta(0, 2));
        assertEquals(false, grafo.existeAresta(2, 1));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        assertEquals(true, grafo.existeAresta(0, 1));
        assertEquals(true, grafo.existeAresta(1, 2));
        assertEquals(true, grafo.existeAresta(2, 0));
        assertEquals(false, grafo.existeAresta(0, 2));
        assertEquals(false, grafo.existeAresta(2, 1));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        grafo.insereAresta(2, 0, 15);
        assertEquals(false, grafo.listaAdjVazia(0));
        assertEquals(false, grafo.listaAdjVazia(1));
        assertEquals(false, grafo.listaAdjVazia(2));
        assertEquals(true, grafo.listaAdjVazia(3));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.primeiroListaAdj(0));
        assertEquals(new Grafo.Aresta(0, 2, 10), grafo.primeiroListaAdj(0));
        assertEquals(new Grafo.Aresta(1, 2, 15), grafo.primeiroListaAdj(1));
        assertNull(grafo.primeiroListaAdj(2));
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        assertEquals(new Grafo.Aresta(0, 2, 10), grafo.proxAdj(0));
        assertNull(grafo.proxAdj(1));
        assertNull(grafo.proxAdj(2));
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        assertEquals(new Grafo.Aresta(0, 1, 5), grafo.retiraAresta(0, 1));
        assertEquals(new Grafo.Aresta(0, 2, 10), grafo.retiraAresta(0, 2));
        assertEquals(new Grafo.Aresta(1, 2, 15), grafo.retiraAresta(1, 2));
        assertNull(grafo.retiraAresta(2, 0));
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 15);
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(true, grafoT.existeAresta(1, 0));
        assertEquals(true, grafoT.existeAresta(2, 0));
        assertEquals(true, grafoT.existeAresta(2, 1));
        assertEquals(false, grafoT.existeAresta(0, 1));
        assertEquals(false, grafoT.existeAresta(0, 2));
        assertEquals(false, grafoT.existeAresta(1, 2));
    }
}