package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;

public class GrafoTest11{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(5, grafo.numVertices());
    }
    
    @Test(timeout=1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertEquals(true, grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        assertEquals(true, grafo.existeAresta(0, 1));
        assertEquals(false, grafo.existeAresta(1, 0));
    }
    
    @Test(timeout=1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(5);
        assertEquals(true, grafo.listaAdjVazia(0));
    }
    
    @Test(timeout=1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }
    
    @Test(timeout=1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(0, 3, 30);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(20, aresta.peso());
    }
    
    @Test(timeout=1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        assertEquals(false, grafo.existeAresta(0, 1));
    }
    
    @Test(timeout=1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.insereAresta(1, 3, 30);
        Grafo grafoT = grafo.grafoTransposto();
        assertEquals(true, grafoT.existeAresta(1, 0));
        assertEquals(true, grafoT.existeAresta(2, 0));
        assertEquals(true, grafoT.existeAresta(3, 1));
    }
}