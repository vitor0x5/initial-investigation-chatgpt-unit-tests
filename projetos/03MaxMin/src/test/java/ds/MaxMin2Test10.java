package ds;
import static org.junit.Assert.*;
import org.junit.Test;
public class MaxMin2Test10{

  
  	@Test(timeout=1000)
  	public void testDefaultConstructor() throws Exception {
    	MaxMin2 mm = new MaxMin2();
  	}
  
  	@Test(timeout=1000)
  	public void testMaxMin2() throws Exception {
    	// Test with positive values
    	int[] v1 = {1, 2, 3, 4, 5};
    	int n1 = 5;
    	int[] result1 = MaxMin2.maxMin2(v1, n1);
    	int[] expected1 = {5, 1};
    	assertArrayEquals(expected1, result1);

    	// Test with negative values
    	int[] v2 = {-5, -4, -3, -2, -1};
    	int n2 = 5;
    	int[] result2 = MaxMin2.maxMin2(v2, n2);
    	int[] expected2 = {-1, -5};
    	assertArrayEquals(expected2, result2);

    	// Test with mixed values
    	int[] v3 = {-5, 3, 0, -2, 7};
    	int n3 = 5;
    	int[] result3 = MaxMin2.maxMin2(v3, n3);
    	int[] expected3 = {7, -5};
    	assertArrayEquals(expected3, result3);
  	}
}