package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Aresta;
import ds.Grafo;

public class GrafoTest5{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Grafo grafo = new Grafo();
    assertNotNull(grafo);
  }
  
  @Test(timeout=1000)
  public void testInsereAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 6);
    grafo.insereAresta(2, 0, 7);
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 0));
  }
  
  @Test(timeout=1000)
  public void testExisteAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 6);
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertFalse(grafo.existeAresta(2, 0));
  }
  
  @Test(timeout=1000)
  public void testListaAdjVazia() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 6);
    assertFalse(grafo.listaAdjVazia(0));
    assertFalse(grafo.listaAdjVazia(1));
    assertTrue(grafo.listaAdjVazia(2));
  }
  
  @Test(timeout=1000)
  public void testPrimeiroListaAdj() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 6);
    grafo.insereAresta(0, 3, 7);
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertEquals(aresta.v1(), 0);
    assertEquals(aresta.v2(), 1);
    assertEquals(aresta.peso(), 5);
  }
  
  @Test(timeout=1000)
  public void testProxAdj() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 6);
    grafo.insereAresta(0, 3, 7);
    grafo.primeiroListaAdj(0);
    Aresta aresta = grafo.proxAdj(0);
    assertEquals(aresta.v1(), 0);
    assertEquals(aresta.v2(), 2);
    assertEquals(aresta.peso(), 6);
  }
  
  @Test(timeout=1000)
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 6);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertEquals(aresta.v1(), 0);
    assertEquals(aresta.v2(), 1);
    assertEquals(aresta.peso(), 5);
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test(timeout=1000)
  public void testGrafoTransposto() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 6);
    grafo.insereAresta(2, 0, 7);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(0, 2));
  }
}