package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest7{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Fibonacci fibonacci = new Fibonacci();
  }

  @Test(timeout=1000)
  public void testFibIter() throws Exception {
    // Test with n = 0
    int result1 = Fibonacci.fibIter(0);
    assertEquals(0, result1);

    // Test with n = 1
    int result2 = Fibonacci.fibIter(1);
    assertEquals(1, result2);

    // Test with n = 2
    int result3 = Fibonacci.fibIter(2);
    assertEquals(1, result3);

    // Test with n = 5
    int result4 = Fibonacci.fibIter(5);
    assertEquals(5, result4);
  }
}