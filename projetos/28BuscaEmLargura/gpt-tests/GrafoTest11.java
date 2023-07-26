package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest11{


    @Test(expected = Exception.class, timeout = 1000)
    public void testConstructor() throws Exception {
        Grafo grafo = new Grafo(10);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.insereAresta(0, 1, 10);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        boolean exists = grafo.existeAresta(0, 1);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(10);
        boolean isEmpty = grafo.listaAdjVazia(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(10);
        Grafo.Aresta aresta = grafo.proxAdj(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(10);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(10);
        grafo.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testNumVertices() throws Exception {
        Grafo grafo = new Grafo(10);
        int numVertices = grafo.numVertices();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(10);
        Grafo grafoT = grafo.grafoTransposto();
    }

}