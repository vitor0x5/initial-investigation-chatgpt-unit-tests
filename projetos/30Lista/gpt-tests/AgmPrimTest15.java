package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class AgmPrimTest15{


  @Test(expected=Exception.class, timeout=1000)
  public void testDefaultConstructor() throws Exception {
    AgmPrim agmPrim = new AgmPrim(null);
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(5);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.obterAgm(0);
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testAntecessor() throws Exception {
    Grafo grafo = new Grafo(5);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.antecessor(0);
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testPeso() throws Exception {
    Grafo grafo = new Grafo(5);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.peso(0);
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testImprime() throws Exception {
    Grafo grafo = new Grafo(5);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.imprime();
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testRetiraMin() throws Exception {
    double[] p = {0, 1, 2, 3, 4};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.retiraMin();
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testDiminuiChave() throws Exception {
    double[] p = {0, 1, 2, 3, 4};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.diminuiChave(1, 0.5);
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testVazio() throws Exception {
    double[] p = {0, 1, 2, 3, 4};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.vazio();
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testImprimeHeap() throws Exception {
    double[] p = {0, 1, 2, 3, 4};
    int[] v = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.imprime();
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testInsereAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1);
  }
  
  @Test(expected=Exception.class, timeout=1000)
  public void testExisteAresta() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.existeAresta(0, 1);
  }
}
