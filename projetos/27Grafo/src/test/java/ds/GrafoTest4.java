package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GrafoTest4{

  
  @Test( timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Grafo grafo = new Grafo(0);
    assertNotNull(grafo);
  }
  
  @Test( timeout=1000)
  public void testInsereAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test( timeout=1000)
  public void testExisteAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
    assertFalse(grafo.existeAresta(1, 0));
  }
  
  @Test( timeout=1000)
  public void testListaAdjVazia() throws Exception {
    Grafo grafo = new Grafo(5);
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
  }
  
  @Test( timeout=1000)
  public void testPrimeiroListaAdj() throws Exception {
    Grafo grafo = new Grafo(5);
    assertNull(grafo.primeiroListaAdj(0));
    grafo.insereAresta(0, 1, 10);
    assertNotNull(grafo.primeiroListaAdj(0));
    assertEquals(0, grafo.primeiroListaAdj(0).v1());
    assertEquals(1, grafo.primeiroListaAdj(0).v2());
    assertEquals(10, grafo.primeiroListaAdj(0).peso());
  }
  
  @Test( timeout=1000)
  public void testImprime() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    grafo.insereAresta(1, 2, 30);
    grafo.insereAresta(1, 3, 40);
    grafo.insereAresta(2, 4, 50);
    grafo.imprime();
  }
  
  @Test( timeout=1000)
  public void testNumVertices() throws Exception {
    Grafo grafo = new Grafo(5);
    assertEquals(5, grafo.numVertices());
    grafo = new Grafo(10);
    assertEquals(10, grafo.numVertices());
  }
  
  @Test( timeout=1000)
  public void testGrafoTransposto() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 20);
    grafo.insereAresta(1, 2, 30);
    grafo.insereAresta(1, 3, 40);
    grafo.insereAresta(2, 4, 50);
    Grafo grafoT = grafo.grafoTransposto();
    assertNotNull(grafoT);
    assertEquals(grafo.numVertices(), grafoT.numVertices());
    assertFalse(grafoT.existeAresta(0, 1));
    assertTrue(grafoT.existeAresta(1, 0));
    assertFalse(grafoT.existeAresta(1, 2));
    assertTrue(grafoT.existeAresta(2, 1));
    assertFalse(grafoT.existeAresta(2, 4));
    assertTrue(grafoT.existeAresta(4, 2));
  }
  
  @Test( timeout=1000)
  public void testListaPesquisa() throws Exception {
    Lista lista = new Lista();
    assertNull(lista.pesquisa(null));
    assertNull(lista.pesquisa("chave"));
    lista.insere("item1");
    assertNotNull(lista.pesquisa("item1"));
    assertNull(lista.pesquisa("item2"));
  }
  
  @Test( timeout=1000)
  public void testListaInsere() throws Exception {
    Lista lista = new Lista();
    lista.insere("item1");
    lista.insere("item2");
    assertNotNull(lista.pesquisa("item1"));
    assertNotNull(lista.pesquisa("item2"));
  }
  
  @Test( timeout=1000)
  public void testListaRetira() throws Exception {
    Lista lista = new Lista();
    lista.insere("item1");
    lista.insere("item2");
    assertNotNull(lista.retira("item1"));
    assertNull(lista.retira("item1"));
    assertNotNull(lista.retira("item2"));
  }
  
  @Test( timeout=1000)
  public void testListaRetiraPrimeiro() throws Exception {
    Lista lista = new Lista();
    lista.insere("item1");
    lista.insere("item2");
    assertNotNull(lista.retiraPrimeiro());
    assertNotNull(lista.retiraPrimeiro());
    assertTrue(lista.vazia());
  }
  
  @Test( timeout=1000)
  public void testListaEstaNaLista() throws Exception {
    Lista lista = new Lista();
    assertFalse(lista.estaNaLista(null));
    assertFalse(lista.estaNaLista("item1"));
    lista.insere("item1");
    assertTrue(lista.estaNaLista("item1"));
    assertFalse(lista.estaNaLista("item2"));
  }
}