package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest6{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Grafo grafo = new Grafo();
    assertNotNull(grafo);
  }
  
  @Test(timeout=1000)
  public void testInsereAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
  }
  
  @Test(timeout=1000)
  public void testExisteAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test(timeout=1000)
  public void testListaAdjVazia() throws Exception {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test(timeout=1000)
  public void testPrimeiroListaAdj() throws Exception {
    Grafo grafo = new Grafo();
    assertNull(grafo.primeiroListaAdj(0));
    grafo.insereAresta(0, 1, 10);
    assertNotNull(grafo.primeiroListaAdj(0));
  }
  
  @Test(timeout=1000)
  public void testProxAdj() throws Exception {
    Grafo grafo = new Grafo();
    assertNull(grafo.proxAdj(0));
    grafo.insereAresta(0, 1, 10);
    assertNotNull(grafo.proxAdj(0));
  }
  
  @Test(timeout=1000)
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo();
    assertNull(grafo.retiraAresta(0, 1));
    grafo.insereAresta(0, 1, 10);
    assertNotNull(grafo.retiraAresta(0, 1));
  }
  
  @Test(timeout=1000)
  public void testGrafoTransposto() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
  }
}