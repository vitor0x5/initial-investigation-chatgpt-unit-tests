package ds;import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest2{


  @Test
  public void testInsereAresta() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
  }

  @Test
  public void testExisteAresta() {
    Grafo grafo = new Grafo(3);
    assertFalse(grafo.existeAresta(0, 1));
  }

  @Test
  public void testListaAdjVazia() {
    Grafo grafo = new Grafo(3);
    assertTrue(grafo.listaAdjVazia(0));
  }

  @Test
  public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }

  @Test
  public void testProxAdj() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    grafo.primeiroListaAdj(0);
    Grafo.Aresta aresta = grafo.proxAdj(0);
    assertEquals(0, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(20, aresta.peso());
  }

  @Test
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    assertEquals(0, aresta.v1());
    assertEquals(1, aresta.v2());
    assertEquals(10, aresta.peso());
  }

  @Test
  public void testNumVertices() {
    Grafo grafo = new Grafo(3);
    assertEquals(3, grafo.numVertices());
  }

  @Test
  public void testGrafoTransposto() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(1, 2, 20);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
  }

}



  @Test
  public void testBuscaEmProfundidade() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
    busca.buscaEmProfundidade();
    assertEquals(1, busca.d(0));
    assertEquals(2, busca.t(0));
    assertEquals(-1, busca.antecessor(0));
  }

}



  @Test
  public void testObterCfc() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 10);
    Cfc cfc = new Cfc(grafo);
    cfc.obterCfc();
    // Verify the output of the method
  }

}



  @Test
  public void testInsere() {
    Lista lista = new Lista();
    lista.insere("item1");
    assertTrue(lista.estaNaLista("item1"));
  }

  @Test
  public void testPesquisa() {
    Lista lista = new Lista();
    lista.insere("item1");
    assertNotNull(lista.pesquisa("item1"));
  }

  @Test
  public void testRetira() throws Exception {
    Lista lista = new Lista();
    lista.insere("item1");
    Object item = lista.retira("item1");
    assertEquals("item1", item);
  }

  @Test
  public void testRetira