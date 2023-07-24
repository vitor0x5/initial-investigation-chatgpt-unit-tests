package ds.llm;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import ds.MaxMin2;

public class MaxMin2Test {

  @Before
  public void setup() throws Exception {
    // This is optional if you have anything to setup before each test
  }

  @Test(timeout=1000)
  public void testMaxMin2_WithDefaultConstructor() throws Exception {
    MaxMin2 obj = new MaxMin2(); // Test for default constructor
    assertNotNull(obj);
  }

  @Test(timeout=1000)
  public void testMaxMin2_WithMixedValues() throws Exception {
    int v[] = {1, 2, -3, 5, -7};
    int n = v.length;
    int[] result = MaxMin2.maxMin2(v, n);
    assertEquals(5, result[0]);
    assertEquals(-7, result[1]);
  }

  @Test(timeout=1000)
  public void testMaxMin2_WithAllPositiveValues() throws Exception {
    int v[] = {1, 2, 3, 4, 5};
    int n = v.length;
    int[] result = MaxMin2.maxMin2(v, n);
    assertEquals(5, result[0]);
    assertEquals(1, result[1]);
  }

  @Test(timeout=1000)
  public void testMaxMin2_WithAllNegativeValues() throws Exception {
    int v[] = {-1, -2, -3, -4, -5};
    int n = v.length;
    int[] result = MaxMin2.maxMin2(v, n);
    assertEquals(-1, result[0]);
    assertEquals(-5, result[1]);
  }

  @Test(timeout=1000)
  public void testMaxMin2_WithSingleValue() throws Exception {
    int v[] = {5};
    int n = v.length;
    int[] result = MaxMin2.maxMin2(v, n);
    assertEquals(5, result[0]);
    assertEquals(5, result[1]);
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class, timeout=1000)
  public void testMaxMin2_WithEmptyArray() throws Exception {
    int v[] = {};
    int n = v.length;
    MaxMin2.maxMin2(v, n);
  }
}
