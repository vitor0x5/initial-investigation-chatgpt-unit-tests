package ds;import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import ds.FPHeapMinIndireto;
import ds.AgmPrim;

public class AgmPrimTest3{

  
  @Test(timeout=1000, expected=Exception.class)
  public void testDefaultConstructor() {
    AgmPrim agmPrim = new AgmPrim(null);
  }
  
  @Test(timeout=1000)
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 4);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(1, 3, 4);
    grafo.insereAresta(1, 4, 2);
    grafo.insereAresta(2, 4, 3);
    grafo.insereAresta(3, 4, 1);
    AgmPrim agmPrim = new AgmPrim(grafo);
    agmPrim.obterAgm(0);
    assertEquals(0, agmPrim.antecessor(0));
    assertEquals(1, agmPrim.antecessor(1));
    assertEquals(0, agmPrim.antecessor(2));
    assertEquals(4, agmPrim.antecessor(3));
    assertEquals(1, agmPrim.antecessor(4));
  }
  
  @Test(timeout=1000, expected=Exception.class)
  public void testRetiraMin() throws Exception {
    double p[] = {Double.MAX_VALUE, 1, 2, 3, 4};
    int v[] = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    assertEquals(1, heap.retiraMin());
    assertEquals(2, heap.retiraMin());
    assertEquals(3, heap.retiraMin());
    assertEquals(4, heap.retiraMin());
    heap.retiraMin();
  }
  
  @Test(timeout=1000, expected=Exception.class)
  public void testDiminuiChave() throws Exception {
    double p[] = {Double.MAX_VALUE, 1, 2, 3, 4};
    int v[] = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    heap.diminuiChave(1, 0);
    assertEquals(1, heap.retiraMin());
    heap.diminuiChave(1, -1);
  }
  
  @Test(timeout=1000)
  public void testVazio() throws Exception {
    double p[] = {Double.MAX_VALUE, 1, 2, 3, 4};
    int v[] = {0, 1, 2, 3, 4};
    FPHeapMinIndireto heap = new FPHeapMinIndireto(p, v);
    assertFalse(heap.vazio());
    heap.retiraMin();
    heap.retiraMin();
    heap.retiraMin();
    heap.retiraMin();
    assertTrue(heap.vazio());
  }
  
}