package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin4;

public class MaxMin4Test1{

  
  @Test
  public void testMaxMin4() {
    int[] v1 = {1, 2, 3, 4, 5};
    int[] result1 = MaxMin4.maxMin4(v1, 0, v1.length-1);
    assertEquals(5, result1[0]);
    assertEquals(1, result1[1]);
    
    int[] v2 = {5, 4, 3, 2, 1};
    int[] result2 = MaxMin4.maxMin4(v2, 0, v2.length-1);
    assertEquals(5, result2[0]);
    assertEquals(1, result2[1]);
    
    int[] v3 = {3, 1, 5, 2, 4};
    int[] result3 = MaxMin4.maxMin4(v3, 0, v3.length-1);
    assertEquals(5, result3[0]);
    assertEquals(1, result3[1]);
    
    int[] v4 = {1};
    int[] result4 = MaxMin4.maxMin4(v4, 0, v4.length-1);
    assertEquals(1, result4[0]);
    assertEquals(1, result4[1]);
    
    int[] v5 = {2, 1};
    int[] result5 = MaxMin4.maxMin4(v5, 0, v5.length-1);
    assertEquals(2, result5[0]);
    assertEquals(1, result5[1]);
  }
}