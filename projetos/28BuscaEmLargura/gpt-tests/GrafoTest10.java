package ds;import org.junit.Assert;
import org.junit.Test;

import ds.Grafo;

public class GrafoTest10{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafo = new Grafo(0);
        Assert.assertEquals(0, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        grafo.insereAresta(1, 2, 3);
        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertTrue(grafo.existeAresta(0, 2));
        Assert.assertTrue(grafo.existeAresta(1, 2));
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        Grafo grafo = new Grafo(2);
        grafo.insereAresta(0, 1, 1);
        Assert.assertTrue(grafo.existeAresta(0, 1));
        Assert.assertFalse(grafo.existeAresta(1, 0));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        Assert.assertFalse(grafo.listaAdjVazia(0));
        Assert.assertTrue(grafo.listaAdjVazia(1));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Assert.assertEquals(1, grafo.primeiroListaAdj(0).v2());
        Assert.assertNull(grafo.primeiroListaAdj(1));
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Assert.assertEquals(2, grafo.proxAdj(0).v2());
        Assert.assertNull(grafo.proxAdj(2)); 
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        Assert.assertNotNull(grafo.retiraAresta(0, 1));
        Assert.assertNull(grafo.retiraAresta(0, 2));
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(2, 3, 3);
        Grafo grafoT = grafo.grafoTransposto();
        Assert.assertTrue(grafoT.existeAresta(1, 0));
        Assert.assertTrue(grafoT.existeAresta(2, 1));
        Assert.assertTrue(grafoT.existeAresta(3, 2));
    }
}