package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest0{

  
  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
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
    grafo.insereAresta(0, 1, 5);
    assertFalse(grafo.listaAdjVazia(0));
    assertTrue(grafo.listaAdjVazia(1));
  }
  
  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    Grafo.Aresta adj = grafo.primeiroListaAdj(0);
    assertEquals(adj.v1(), 0);
    assertEquals(adj.v2(), 1);
    assertEquals(adj.peso(), 5);
  }
  
  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(0, 3, 15);
    Grafo.Aresta adj = grafo.primeiroListaAdj(0);
    adj = grafo.proxAdj(0);
    assertEquals(adj.v1(), 0);
    assertEquals(adj.v2(), 2);
    assertEquals(adj.peso(), 10);
  }
  
  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    assertEquals(aresta.v1(), 0);
    assertEquals(aresta.v2(), 1);
    assertEquals(aresta.peso(), 5);
    assertFalse(grafo.existeAresta(0, 1));
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(0, 2, 10);
    grafo.insereAresta(1, 3, 15);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 0));
    assertTrue(grafoT.existeAresta(3, 1));
  }
}