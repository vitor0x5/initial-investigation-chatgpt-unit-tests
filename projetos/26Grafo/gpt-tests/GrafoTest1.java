package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest1{


  @Test
  public void testGrafo() {
    Grafo grafo = new Grafo(5);
    assertNotNull(grafo);
  }

  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
  }

  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }

  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo(5);
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
  }

  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }

  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    aresta = grafo.proxAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(20, aresta.peso());
    aresta = grafo.proxAdj(0);
    assertNull(aresta);
  }

  @Test
  public void testRetiraAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    assertTrue(grafo.existeAresta(0, 2));
    assertFalse(grafo.existeAresta(0, 1));
  }

  @Test
  public void testImprime() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    grafo.insereAresta(1, 2, 30);
    grafo.insereAresta(2, 3, 40);
    grafo.insereAresta(3, 4, 50);
    grafo.imprime();
  }

  @Test
  public void testNumVertices() {
    Grafo grafo = new Grafo(5);
    assertEquals(5, grafo.numVertices());
  }

  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 3, 30);
    grafo.insereAresta(3, 4, 40);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
    assertTrue(grafoT.existeAresta(4, 3));
  }

}