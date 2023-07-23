package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AgmPrimTest0{

  
  private AgmPrim agm;
  
  @Before
  public void setUp() throws Exception {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(0, 2, 4);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(1, 3, 5);
    grafo.insereAresta(2, 3, 3);
    
    agm = new AgmPrim(grafo);
  }
  
  @Test
  public void testObterAgm() throws Exception {
    agm.obterAgm(0);
    assertEquals(0, agm.antecessor(0));
    assertEquals(-1, agm.antecessor(1));
    assertEquals(0, agm.antecessor(2));
    assertEquals(2, agm.antecessor(3));
  }
  
  @Test
  public void testPeso() throws Exception {
    agm.obterAgm(0);
    assertEquals(0, agm.peso(0), 0.001);
    assertEquals(Double.MAX_VALUE, agm.peso(1), 0.001);
    assertEquals(4, agm.peso(2), 0.001);
    assertEquals(3, agm.peso(3), 0.001);
  }
  
  @Test
  public void testImprime() throws Exception {
    agm.obterAgm(0);
    agm.imprime();
  }
}