package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.FPHeapMinIndireto;

public class AgmPrimTest14{


  @Test(timeout=1000)
  public void testDefaultConstructor() {
    AgmPrim agmPrim = new AgmPrim(null);
  }

  @Test(timeout=1000)
  public void testRefaz() {
    double[] p = {0, 1, 2, 3};
    int[] v = {0, 1, 2, 3};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.refaz(1, 3);
  }

  @Test(timeout=1000)
  public void testConstroi() {
    double[] p = {0, 1, 2, 3};
    int[] v = {0, 1, 2, 3};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.constroi();
  }

  @Test(timeout=1000)
  public void testRetiraMin() throws Exception {
    double[] p = {0, 1, 2, 3};
    int[] v = {0, 1, 2, 3};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.retiraMin();
  }

  @Test(timeout=1000)
  public void testDiminuiChave() throws Exception {
    double[] p = {0, 1, 2, 3};
    int[] v = {0, 1, 2, 3};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.diminuiChave(1, 0.5);
  }

  @Test(timeout=1000)
  public void testVazio() {
    double[] p = {0, 1, 2, 3};
    int[] v = {0, 1, 2, 3};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.vazio();
  }

  @Test(timeout=1000)
  public void testImprime() {
    double[] p = {0, 1, 2, 3};
    int[] v = {0, 1, 2, 3};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.imprime();
  }

  @Test(timeout=1000)
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(4);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.obterAgm(0);
  }

  @Test(timeout=1000)
  public void testAntecessor() {
    Grafo grafo = new Grafo(4);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.antecessor(1);
  }

  @Test(timeout=1000)
  public void testPeso() {
    Grafo grafo = new Grafo(4);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.peso(1);
  }

  @Test(timeout=1000)
  public void testImprimeAgmPrim() {
    Grafo grafo = new Grafo(4);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.imprime();
  }
}