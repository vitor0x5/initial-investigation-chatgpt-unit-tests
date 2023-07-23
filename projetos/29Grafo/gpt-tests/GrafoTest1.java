package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest1{


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
    assertFalse(grafo.existeAresta(3, 4));
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
    grafo.insereAresta(0, 2, 5);
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }

  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 5);
    grafo.insereAresta(0, 3, 8);
    Grafo.Aresta aresta1 = grafo.primeiroListaAdj(0);
    Grafo.Aresta aresta2 = grafo.proxAdj(0);
    Grafo.Aresta aresta3 = grafo.proxAdj(0);
    assertEquals(0, aresta1.v1());
    assertEquals(1, aresta1.v2());
    assertEquals(10, aresta1.peso());
    assertEquals(0, aresta2.v1());
    assertEquals(2, aresta2.v2());
    assertEquals(5, aresta2.peso());
    assertEquals(0, aresta3.v1());
    assertEquals(3, aresta3.v2());
    assertEquals(8, aresta3.peso());
  }

  @Test
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 5);
    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
    assertFalse(grafo.existeAresta(0, 1));
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
    grafo.insereAresta(1, 2, 5);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
  }
}



  @Test
  public void testBuscaEmProfundidade() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 5);
    grafo.insereAresta(2, 3, 3);
    grafo.insereAresta(3, 4, 2);
    BuscaEmProfundidade dfs = new BuscaEmProfundidade(grafo);
    dfs.buscaEmProfundidade();
    assertEquals(1,