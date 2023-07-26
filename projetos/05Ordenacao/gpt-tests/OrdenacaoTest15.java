package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class OrdenacaoTest15{


  private Ordenacao ordenacao;

  @Before
  public void setUp() {
    ordenacao = new Ordenacao();
  }

  @After
  public void tearDown() {
    ordenacao = null;
  }

  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    assertNotNull(ordenacao);
  }

  @Test(timeout=1000)
  public void testOrdena() throws Exception {
    // Test with empty array
    int[] emptyArray = {};
    ordenacao.ordena(emptyArray, 0);
    assertArrayEquals(new int[]{}, emptyArray);

    // Test with array of size 1
    int[] arraySize1 = {5};
    ordenacao.ordena(arraySize1, 1);
    assertArrayEquals(new int[]{5}, arraySize1);

    // Test with array of size 2
    int[] arraySize2 = {3, 1};
    ordenacao.ordena(arraySize2, 2);
    assertArrayEquals(new int[]{1, 3}, arraySize2);

    // Test with array of size 3
    int[] arraySize3 = {7, 2, 5};
    ordenacao.ordena(arraySize3, 3);
    assertArrayEquals(new int[]{2, 5, 7}, arraySize3);

    // Test with array of size 4
    int[] arraySize4 = {9, 4, 6, 3};
    ordenacao.ordena(arraySize4, 4);
    assertArrayEquals(new int[]{3, 4, 6, 9}, arraySize4);

    // Test with array of size 5
    int[] arraySize5 = {8, 2, 7, 1, 6};
    ordenacao.ordena(arraySize5, 5);
    assertArrayEquals(new int[]{1, 2, 6, 7, 8}, arraySize5);
  }
}