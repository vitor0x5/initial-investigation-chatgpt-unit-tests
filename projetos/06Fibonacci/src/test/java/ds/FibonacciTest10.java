package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest10{


	@Test( timeout = 1000)
	public void testDefaultConstructor() throws Exception {
		new Fibonacci();
	}

	@Test(timeout = 1000)
	public void testFibIter_PositiveValue() throws Exception {
		int result = Fibonacci.fibIter(5);
		assertEquals(5, result);
	}

	@Test(timeout = 1000)
	public void testFibIter_ZeroValue() throws Exception {
		int result = Fibonacci.fibIter(0);
		assertEquals(0, result);
	}

	@Test(timeout = 1000)
	public void testFibIter_NegativeValue() throws Exception {
		int result = Fibonacci.fibIter(-5);
		assertEquals(0, result);
	}


	@Test(timeout = 1000)
	public void testFibIter_MinIntValue() throws Exception {
		int result = Fibonacci.fibIter(Integer.MIN_VALUE);
		assertEquals(0, result);
	}
}