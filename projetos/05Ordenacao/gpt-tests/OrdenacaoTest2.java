package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest2{


  // Test case to cover the outer for loop once
  @Test
  public void testOrdenaOuterLoop() {
    int[] v = {5, 3, 2, 4, 1};
    Ordenacao.ordena(v, v.length);
    int[] expected = {1, 2, 3, 4, 5};
    assertArrayEquals(expected, v);
  }

  // Test case to cover the inner for loop once
  @Test
  public void testOrdenaInnerLoop() {
    int[] v = {5, 3, 2, 4, 1};
    Ordenacao.ordena(v, v.length);
    int[] expected = {1, 2, 3, 4, 5};
    assertArrayEquals(expected, v);
  }

  // Test case to cover the if condition inside the inner for loop
  @Test
  public void testOrdenaIfCondition() {
    int[] v = {5, 3, 2, 4, 1};
    Ordenacao.ordena(v, v.length);
    int[] expected = {1, 2, 3, 4, 5};
    assertArrayEquals(expected, v);
  }
}