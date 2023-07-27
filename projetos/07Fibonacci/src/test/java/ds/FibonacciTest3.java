package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest3{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }
    
    @Test(timeout=1000)
    public void testFibIter_PositiveValue() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }
    
    @Test(timeout=1000)
    public void testFibIter_NegativeValue() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(0, result);
    }
    
    @Test(timeout=1000)
    public void testFibIter_ZeroValue() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }
    
    @Test(timeout=1000)
    public void testFibIter_BoundaryValue() throws Exception {
        int result = Fibonacci.fibIter(1);
        assertEquals(1, result);
    }
}