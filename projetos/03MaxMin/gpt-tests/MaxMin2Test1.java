package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin2;

public class MaxMin2Test1{


  @Test
  public void testMaxMin2() {
    int[] v = {1, 2, 3, 4, 5};
    int n = 5;
    int[] expected = {5, 1};
    int[] result = MaxMin2.maxMin2(v, n);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin2WithNegativeNumbers() {
    int[] v = {-5, -4, -3, -2, -1};
    int n = 5;
    int[] expected = {-1, -5};
    int[] result = MaxMin2.maxMin2(v, n);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin2WithSingleElement() {
    int[] v = {100};
    int n = 1;
    int[] expected = {100, 100};
    int[] result = MaxMin2.maxMin2(v, n);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testMaxMin2WithEmptyArray() {
    int[] v = {};
    int n = 0;
    int[] expected = {0, 0};
    int[] result = MaxMin2.maxMin2(v, n);
    assertArrayEquals(expected, result);
  }

}