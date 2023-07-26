package ds;import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class AvaliaMultMatrizesTest7{

  
  @Test(timeout=1000, expected=IOException.class)
  public void testDefaultConstructor() throws Exception {
    AvaliaMultMatrizes obj = new AvaliaMultMatrizes();
  }
  
  @Test(timeout=1000)
  public void testMultMatrizes() throws Exception {
    int n = 3;
    int[] d = {1, 2, 3};
    
    AvaliaMultMatrizes.multmatrize(n, d);
  }
  
  // Test for method with conditional expression assuming true value
  @Test(timeout=1000)
  public void testMultMatrizesTrue() throws Exception {
    int n = 3;
    int[] d = {1, 2, 3};
    
    AvaliaMultMatrizes.multmatrize(n, d);
  }
  
  // Test for method with conditional expression assuming false value
  @Test(timeout=1000)
  public void testMultMatrizesFalse() throws Exception {
    int n = 3;
    int[] d = {1, 2, -3};
    
    AvaliaMultMatrizes.multmatrize(n, d);
  }
  
  // Test for method with boundary values for numeric data (positive value)
  @Test(timeout=1000)
  public void testMultMatrizesPositiveBoundary() throws Exception {
    int n = 2;
    int[] d = {1, 2};
    
    AvaliaMultMatrizes.multmatrize(n, d);
  }
  
  // Test for method with boundary values for numeric data (negative value)
  @Test(timeout=1000)
  public void testMultMatrizesNegativeBoundary() throws Exception {
    int n = 2;
    int[] d = {1, -2};
    
    AvaliaMultMatrizes.multmatrize(n, d);
  }
}