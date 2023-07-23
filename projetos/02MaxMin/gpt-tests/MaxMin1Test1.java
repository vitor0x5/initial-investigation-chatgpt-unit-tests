package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test1{

  
  @Test
  public void testMaxMin1() {
    int[] v = {1, 2, 3, 4, 5};
    int n = v.length;
    int[] expected = {5, 1};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin1WithNegativeNumbers() {
    int[] v = {-5, -4, -3, -2, -1};
    int n = v.length;
    int[] expected = {-1, -5};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin1WithSameNumbers() {
    int[] v = {1, 1, 1, 1, 1};
    int n = v.length;
    int[] expected = {1, 1};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin1WithOneElement() {
    int[] v = {10};
    int n = v.length;
    int[] expected = {10, 10};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
}