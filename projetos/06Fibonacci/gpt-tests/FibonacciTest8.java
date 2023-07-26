package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest8{


   @Test(timeout=1000)
   public void testDefaultConstructor() throws Exception {
      Fibonacci fibonacci = new Fibonacci();
   }

   @Test(timeout=1000)
   public void testFibIterWithPositiveValue() throws Exception {
      assertEquals(0, Fibonacci.fibIter(0));
      assertEquals(1, Fibonacci.fibIter(1));
      assertEquals(1, Fibonacci.fibIter(2));
      assertEquals(2, Fibonacci.fibIter(3));
      assertEquals(3, Fibonacci.fibIter(4));
      assertEquals(5, Fibonacci.fibIter(5));
      assertEquals(8, Fibonacci.fibIter(6));
      assertEquals(13, Fibonacci.fibIter(7));
      assertEquals(21, Fibonacci.fibIter(8));
   }

   @Test(timeout=1000)
   public void testFibIterWithNegativeValue() throws Exception {
      assertEquals(0, Fibonacci.fibIter(-1));
      assertEquals(1, Fibonacci.fibIter(-2));
      assertEquals(-1, Fibonacci.fibIter(-3));
      assertEquals(2, Fibonacci.fibIter(-4));
      assertEquals(-3, Fibonacci.fibIter(-5));
      assertEquals(5, Fibonacci.fibIter(-6));
      assertEquals(-8, Fibonacci.fibIter(-7));
      assertEquals(13, Fibonacci.fibIter(-8));
      assertEquals(-21, Fibonacci.fibIter(-9));
   }

   @Test(timeout=1000)
   public void testFibIterWithBoundaryValues() throws Exception {
      assertEquals(0, Fibonacci.fibIter(Integer.MIN_VALUE));
      assertEquals(0, Fibonacci.fibIter(Integer.MAX_VALUE));
   }
}