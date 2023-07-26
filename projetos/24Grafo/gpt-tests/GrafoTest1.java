package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest1{


  @Test(expected = Exception.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    Grafo grafo = new Grafo();
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testInsereAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testExisteAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    boolean exists = grafo.existeAresta(1, 2);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testListaAdjVazia() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    boolean isEmpty = grafo.listaAdjVazia(1);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testPrimeiroListaAdj() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    Aresta firstAdj = grafo.primeiroListaAdj(1);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testProxAdj() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    grafo.primeiroListaAdj(1);
    Aresta nextAdj = grafo.proxAdj(1);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    Aresta removedAresta = grafo.retiraAresta(1, 2);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testImprime() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    grafo.imprime();
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testGrafoTransposto() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 3);
    Grafo transposedGrafo = grafo.grafoTransposto();
  }
}