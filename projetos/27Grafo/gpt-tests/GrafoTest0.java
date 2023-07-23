package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Grafo;
import ds.BuscaEmProfundidade;

public class GrafoTest0{


  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);
    grafo.insereAresta(3, 4, 5);
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
  }

  @Test
  public void testBuscaEmProfundidade() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);
    grafo.insereAresta(3, 4, 5);

    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
    busca.buscaEmProfundidade();

    assertEquals(busca.d(0), 1);
    assertEquals(busca.d(1), 2);
    assertEquals(busca.d(2), 3);
    assertEquals(busca.d(3), 4);
    assertEquals(busca.d(4), 5);

    assertEquals(busca.t(0), 10);
    assertEquals(busca.t(1), 9);
    assertEquals(busca.t(2), 8);
    assertEquals(busca.t(3), 7);
    assertEquals(busca.t(4), 6);

    assertEquals(busca.antecessor(0), -1);
    assertEquals(busca.antecessor(1), 0);
    assertEquals(busca.antecessor(2), 1);
    assertEquals(busca.antecessor(3), 2);
    assertEquals(busca.antecessor(4), 3);
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(2, 3, 4);
    grafo.insereAresta(3, 4, 5);

    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
    assertTrue(grafoT.existeAresta(4, 3));
  }

}