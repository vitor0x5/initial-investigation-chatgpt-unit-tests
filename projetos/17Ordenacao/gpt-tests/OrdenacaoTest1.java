package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class OrdenacaoTest1{

  
  @Test
  public void testSelecao() {
    Item[] v = {new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)};
    Ordenacao.selecao(v, 4);
    assertEquals(new MeuItem(1), v[0]);
    assertEquals(new MeuItem(3), v[1]);
    assertEquals(new MeuItem(5), v[2]);
    assertEquals(new MeuItem(8), v[3]);
  }
  
  @Test
  public void testInsercao() {
    Item[] v = {new MeuItem(7), new MeuItem(2), new MeuItem(9), new MeuItem(4)};
    Ordenacao.insercao(v, 4);
    assertEquals(new MeuItem(2), v[0]);
    assertEquals(new MeuItem(4), v[1]);
    assertEquals(new MeuItem(7), v[2]);
    assertEquals(new MeuItem(9), v[3]);
  }
  
  @Test
  public void testShellsort() {
    Item[] v = {new MeuItem(6), new MeuItem(2), new MeuItem(10), new MeuItem(3)};
    Ordenacao.shellsort(v, 4);
    assertEquals(new MeuItem(2), v[0]);
    assertEquals(new MeuItem(3), v[1]);
    assertEquals(new MeuItem(6), v[2]);
    assertEquals(new MeuItem(10), v[3]);
  }
  
  @Test
  public void testQuicksort() {
    Item[] v = {new MeuItem(9), new MeuItem(5), new MeuItem(1), new MeuItem(7)};
    Ordenacao.quicksort(v, 4);
    assertEquals(new MeuItem(1), v[0]);
    assertEquals(new MeuItem(5), v[1]);
    assertEquals(new MeuItem(7), v[2]);
    assertEquals(new MeuItem(9), v[3]);
  }
  
  @Test
  public void testHeapsort() {
    Item[] v = {new MeuItem(4), new MeuItem(8), new MeuItem(2), new MeuItem(6)};
    Ordenacao.heapsort(v, 4);
    assertEquals(new MeuItem(2), v[0]);
    assertEquals(new MeuItem(4), v[1]);
    assertEquals(new MeuItem(6), v[2]);
    assertEquals(new MeuItem(8), v[3]);
  }
}