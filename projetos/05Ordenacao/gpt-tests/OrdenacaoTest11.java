package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest11{


  @Test(timeout=1000)
  public void testDefaultConstructor() {
    Ordenacao ordenacao = new Ordenacao();
    assertNotNull(ordenacao);
  }

  @Test(timeout=1000)
  public void testOrdenaEmptyArray() {
    int[] v = {};
    Ordenacao.ordena(v, 0);
    assertEquals(0, v.length);
  }

  @Test(timeout=1000)
  public void testOrdenaArrayWithOneElement() {
    int[] v = {5};
    Ordenacao.ordena(v, 1);
    assertEquals(5, v[0]);
  }

  @Test(timeout=1000)
  public void testOrdenaArrayWithPositiveNumbers() {
    int[] v = {3, 8, 2, 4, 1};
    int[] expected = {1, 2, 3, 4, 8};
    Ordenacao.ordena(v, 5);
    assertArrayEquals(expected, v);
  }

  @Test(timeout=1000)
  public void testOrdenaArrayWithNegativeNumbers() {
    int[] v = {-3, -8, -2, -4, -1};
    int[] expected = {-8, -4, -3, -2, -1};
    Ordenacao.ordena(v, 5);
    assertArrayEquals(expected, v);
  }

  @Test(timeout=1000)
  public void testOrdenaArrayWithPositiveAndNegativeNumbers() {
    int[] v = {3, 8, -2, -4, 1};
    int[] expected = {-4, -2, 1, 3, 8};
    Ordenacao.ordena(v, 5);
    assertArrayEquals(expected, v);
  }
}