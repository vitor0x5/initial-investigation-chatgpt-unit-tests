package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest9{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Ordenacao ordenacao = new Ordenacao();
  }
  
  @Test(timeout=1000)
  public void testMergeSort() throws Exception {
    int[] v = {4, 7, 2, 5};
    int[] expected = {2, 4, 5, 7};
    
    Ordenacao.mergeSort(v, 0, 3);
    
    assertArrayEquals(expected, v);
  }
}