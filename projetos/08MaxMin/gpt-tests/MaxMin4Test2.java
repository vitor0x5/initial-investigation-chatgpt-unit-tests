package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test2{

  
  @Test
  public void testMaxMin4() {
    int[] v = {4, 2, 6, 1, 9, 3, 7, 5};
    int linf = 0;
    int lsup = v.length - 1;
    
    int[] expectedResult = {9, 1};
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expectedResult, result);
  }
  
  @Test
  public void testMaxMin4WithDuplicateValues() {
    int[] v = {4, 2, 6, 1, 9, 3, 7, 5, 5};
    int linf = 0;
    int lsup = v.length - 1;
    
    int[] expectedResult = {9, 1};
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expectedResult, result);
  }
  
  @Test
  public void testMaxMin4WithEmptyArray() {
    int[] v = {};
    int linf = 0;
    int lsup = v.length - 1;
    
    int[] expectedResult = {0, 0};
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    
    assertArrayEquals(expectedResult, result);
  }
}