package ds;import org.junit.*;
import static org.junit.Assert.*;

public class MaxMin1Test0{


  @Test
  public void testMaxMin1() {
    int[] v = {1, 2, 3, 4, 5};
    int n = 5;
    int[] expected = {5, 1};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin1WithNegativeNumbers() {
    int[] v = {-5, -4, -3, -2, -1};
    int n = 5;
    int[] expected = {-1, -5};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin1WithOneElement() {
    int[] v = {10};
    int n = 1;
    int[] expected = {10, 10};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin1WithEmptyArray() {
    int[] v = {};
    int n = 0;
    int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
    int[] result = MaxMin1.maxMin1(v, n);
    assertArrayEquals(expected, result);
  }
  
}