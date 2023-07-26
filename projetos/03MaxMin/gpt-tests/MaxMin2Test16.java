package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test16{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    MaxMin2 mm = new MaxMin2();
    assertNotNull(mm);
  }

  @Test(timeout=1000)
  public void testMaxMin2() throws Exception {
    int[] v = {1, 2, 3, 4, 5};
    int[] expected = {5, 1};
    int[] result = MaxMin2.maxMin2(v, v.length);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin2WithNegativeValues() throws Exception {
    int[] v = {-5, -4, -3, -2, -1};
    int[] expected = {-1, -5};
    int[] result = MaxMin2.maxMin2(v, v.length);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin2WithDuplicateValues() throws Exception {
    int[] v = {1, 2, 3, 3, 4, 5};
    int[] expected = {5, 1};
    int[] result = MaxMin2.maxMin2(v, v.length);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin2WithEmptyArray() throws Exception {
    int[] v = {};
    int[] expected = {0, 0};
    int[] result = MaxMin2.maxMin2(v, v.length);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin2WithSingleElementArray() throws Exception {
    int[] v = {5};
    int[] expected = {5, 5};
    int[] result = MaxMin2.maxMin2(v, v.length);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin2WithLargeArray() throws Exception {
    int[] v = new int[1000000];
    for (int i = 0; i < v.length; i++) {
      v[i] = i + 1;
    }
    int[] expected = {1000000, 1};
    int[] result = MaxMin2.maxMin2(v, v.length);
    assertArrayEquals(expected, result);
  }
}