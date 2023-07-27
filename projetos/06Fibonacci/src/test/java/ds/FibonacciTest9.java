package ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest9{
@Test(timeout = 1000)
	public void testFibIter_NegativeValue() throws Exception {
		int result = Fibonacci.fibIter(-5);
		assertEquals(0, result);
	}

}