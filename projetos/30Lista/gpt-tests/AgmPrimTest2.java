package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.AgmPrim;
import ds.Grafo;

public class AgmPrimTest2{


  @Test
  public void testObterAgm() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 3, 6);
    grafo.insereAresta(1, 2, 3);
    grafo.insereAresta(1, 3, 8);
    grafo.insereAresta(1, 4, 5);
    grafo.insereAresta(2, 4, 7);
    grafo.insereAresta(3, 4, 9);
    
    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);
    
    int[] expectedAntecessor = {-1, 0, 1, 0, 1};
    double[] expectedPeso = {0.0, 2.0, 3.0, 6.0, 5.0};
    
    assertArrayEquals(expectedAntecessor, agm.getAntecessor());
    assertArrayEquals(expectedPeso, agm.getPeso(), 0.001);
  }
}