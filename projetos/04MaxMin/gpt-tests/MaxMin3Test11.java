package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test11{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    MaxMin3 maxMin3 = new MaxMin3();
  }

  @Test(timeout=1000)
  public void testMaxMin3Method() throws Exception {
    int[] v = {1, 2, 3, 4, 5, 6};
    int n = 6;
    int[] expected = {6, 1};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin3Method_NegativeValues() throws Exception {
    int[] v = {-1, -2, -3, -4, -5, -6};
    int n = 6;
    int[] expected = {-1, -6};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }

  @Test(timeout=1000)
  public void testMaxMin3Method_BoundaryValues() throws Exception {
    int[] v = {0, 0, 0, 0, 0, 0};
    int n = 6;
    int[] expected = {0, 0};
    int[] result = MaxMin3.maxMin3(v, n);
    assertArrayEquals(expected, result);
  }
}