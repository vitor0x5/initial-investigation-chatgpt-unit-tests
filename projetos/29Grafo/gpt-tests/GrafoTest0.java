package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest0{


  @Test
  public void testBuscaEmProfundidade() {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(2, 3, 1);
    grafo.insereAresta(3, 4, 1);

    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
    busca.buscaEmProfundidade();

    assertEquals(1, busca.d(0));
    assertEquals(2, busca.d(1));
    assertEquals(3, busca.d(2));
    assertEquals(4, busca.d(3));
    assertEquals(5, busca.d(4));

    assertEquals(5, busca.t(0));
    assertEquals(4, busca.t(1));
    assertEquals(3, busca.t(2));
    assertEquals(2, busca.t(3));
    assertEquals(1, busca.t(4));

    assertEquals(-1, busca.antecessor(0));
    assertEquals(0, busca.antecessor(1));
    assertEquals(1, busca.antecessor(2));
    assertEquals(2, busca.antecessor(3));
    assertEquals(3, busca.antecessor(4));
  }
}