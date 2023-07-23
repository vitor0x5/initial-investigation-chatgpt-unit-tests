package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ds.Grafo;
import ds.BuscaEmLargura;

public class GrafoTest1{


  private Grafo grafo;

  @Before
  public void setUp() {
    grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 2);
    grafo.insereAresta(2, 3, 3);
    grafo.insereAresta(3, 4, 4);
    grafo.insereAresta(4, 0, 5);
  }

  @Test
  public void testExisteAresta() {
    assertTrue(grafo.existeAresta(0, 1));
    assertTrue(grafo.existeAresta(1, 2));
    assertTrue(grafo.existeAresta(2, 3));
    assertTrue(grafo.existeAresta(3, 4));
    assertTrue(grafo.existeAresta(4, 0));
    assertFalse(grafo.existeAresta(0, 3));
    assertFalse(grafo.existeAresta(1, 4));
    assertFalse(grafo.existeAresta(2, 0));
    assertFalse(grafo.existeAresta(3, 1));
    assertFalse(grafo.existeAresta(4, 2));
  }

  @Test
  public void testListaAdjVazia() {
    assertFalse(grafo.listaAdjVazia(0));
    assertFalse(grafo.listaAdjVazia(1));
    assertFalse(grafo.listaAdjVazia(2));
    assertFalse(grafo.listaAdjVazia(3));
    assertFalse(grafo.listaAdjVazia(4));
    assertTrue(grafo.listaAdjVazia(2));
    assertTrue(grafo.listaAdjVazia(3));
    assertTrue(grafo.listaAdjVazia(4));
  }

  @Test
  public void testPrimeiroListaAdj() {
    assertEquals(1, grafo.primeiroListaAdj(0).v2());
    assertEquals(2, grafo.primeiroListaAdj(1).v2());
    assertEquals(3, grafo.primeiroListaAdj(2).v2());
    assertEquals(4, grafo.primeiroListaAdj(3).v2());
    assertEquals(0, grafo.primeiroListaAdj(4).v2());
  }

  @Test
  public void testProxAdj() {
    assertEquals(1, grafo.proxAdj(0).v2());
    assertEquals(2, grafo.proxAdj(1).v2());
    assertEquals(3, grafo.proxAdj(2).v2());
    assertEquals(4, grafo.proxAdj(3).v2());
    assertEquals(0, grafo.proxAdj(4).v2());
    assertNull(grafo.proxAdj(2));
    assertNull(grafo.proxAdj(3));
    assertNull(grafo.proxAdj(4));
  }
  
  @Test
  public void testRetiraAresta() throws Exception {
    assertNotNull(grafo.retiraAresta(0, 1));
    assertNull(grafo.retiraAresta(0, 1));
    assertNotNull(grafo.retiraAresta(1, 2));
    assertNull(grafo.retiraAresta(1, 2));
    assertNotNull(grafo.retiraAresta(2, 3));
    assertNull(grafo.retiraAresta(2, 3));
    assertNotNull(grafo.retiraAresta(3, 4));
    assertNull(grafo.retiraAresta(3, 4));
    assertNotNull(grafo.retiraAresta(4, 0));
    assertNull(grafo.retiraAresta(4, 0));
  }
  
  @Test
  public void testNumVertices() {
    assertEquals(5, grafo.numVertices());
  }
  
  @Test
  public void testGrafoTransposto() {
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertTrue(grafoT.existeAresta(2, 1));
    assertTrue(grafoT.existeAresta(3, 2));
    assertTrue(grafoT.existeAresta(4, 3));
    assertTrue(grafoT.existeAresta(0, 4));
    assertFalse(grafoT.existeAresta(0, 1));
    assertFalse(grafoT.existeAresta(1, 2));
    assertFalse(grafoT.existeAresta(2, 3));
    assertFalse(grafoT.existeAresta(3, 4));
    assertFalse(grafoT.existeArest