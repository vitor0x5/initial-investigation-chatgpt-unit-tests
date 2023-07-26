package ds;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test7{


  @Test(timeout=1000)
  public void testConstructor() throws Exception {
    MaxMin2 mm = new MaxMin2();
    assertNotNull(mm);
  }
  
  @Test(timeout=1000)
  public void testMaxMin2() throws Exception {
    int[] v = {1, 2, 3, 4, 5};
    int[] result = MaxMin2.maxMin2(v, v.length);
    int[] expected = {5, 1};
    assertArrayEquals(expected, result);
  }
  
  @Test(timeout=1000)
  public void testMaxMin2NegativeValues() throws Exception {
    int[] v = {-5, -4, -3, -2, -1};
    int[] result = MaxMin2.maxMin2(v, v.length);
    int[] expected = {-1, -5};
    assertArrayEquals(expected, result);
  }
  
  @Test(timeout=1000)
  public void testMaxMin2DuplicateValues() throws Exception {
    int[] v = {5, 5, 5, 5, 5};
    int[] result = MaxMin2.maxMin2(v, v.length);
    int[] expected = {5, 5};
    assertArrayEquals(expected, result);
  }
  
  @Test(timeout=1000)
  public void testMaxMin2EmptyArray() throws Exception {
    int[] v = {};
    int[] result = MaxMin2.maxMin2(v, v.length);
    int[] expected = {0, 0};
    assertArrayEquals(expected, result);
  }
  
  @Test(timeout=1000)
  public void testMaxMin2SingleElement() throws Exception {
    int[] v = {10};
    int[] result = MaxMin2.maxMin2(v, v.length);
    int[] expected = {10, 10};
    assertArrayEquals(expected, result);
  }
  
  @Test(timeout=1000)
  public void testMaxMin2LargeArray() throws Exception {
    int[] v = new int[100000];
    for (int i = 0; i < v.length; i++) {
      v[i] = i;
    }
    int[] result = MaxMin2.maxMin2(v, v.length);
    int[] expected = {99999, 0};
    assertArrayEquals(expected, result);
  }
}