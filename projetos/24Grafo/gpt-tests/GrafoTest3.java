package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Aresta;
import ds.Grafo;

public class GrafoTest3{


  @Test(expected = Exception.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    Grafo grafo = new Grafo();
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testInsereAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testExisteAresta() throws Exception {
    Grafo grafo = new Grafo();
    assertFalse(grafo.existeAresta(0, 1));
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testListaAdjVazia() throws Exception {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testPrimeiroListaAdj() throws Exception {
    Grafo grafo = new Grafo();
    assertNull(grafo.primeiroListaAdj(0));
    grafo.insereAresta(0, 1, 10);
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testProxAdj() throws Exception {
    Grafo grafo = new Grafo();
    assertNull(grafo.proxAdj(0));
    grafo.insereAresta(0, 1, 10);
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    assertNull(grafo.proxAdj(0));
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo();
    assertNull(grafo.retiraAresta(0, 1));
    grafo.insereAresta(0, 1, 10);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertNotNull(aresta);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    assertFalse(grafo.existeAresta(0, 1));
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testImprime() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 0, 30);
    grafo.imprime();
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testGrafoTransposto() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    grafo.insereAresta(2, 0, 30);
    Grafo grafoT = grafo.grafoTransposto();
    assertFalse(grafoT.listaAdjVazia(0));
    assertTrue(grafoT.existeAresta(1, 0));
    assertFalse(grafoT.existeAresta(0, 1));
  }
}