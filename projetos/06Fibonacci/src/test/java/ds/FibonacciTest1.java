package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    @Test(timeout=1000)
    public void testFibIter() throws Exception {
        assertEquals(0, Fibonacci.fibIter(0));
        assertEquals(1, Fibonacci.fibIter(1));
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
        assertEquals(13, Fibonacci.fibIter(7));
        assertEquals(21, Fibonacci.fibIter(8));
        assertEquals(34, Fibonacci.fibIter(9));
        assertEquals(55, Fibonacci.fibIter(10));
        assertEquals(89, Fibonacci.fibIter(11));
        assertEquals(144, Fibonacci.fibIter(12));
        assertEquals(233, Fibonacci.fibIter(13));
        assertEquals(377, Fibonacci.fibIter(14));
        assertEquals(610, Fibonacci.fibIter(15));
        assertEquals(987, Fibonacci.fibIter(16));
        assertEquals(1597, Fibonacci.fibIter(17));
        assertEquals(2584, Fibonacci.fibIter(18));
        assertEquals(4181, Fibonacci.fibIter(19));
        assertEquals(6765, Fibonacci.fibIter(20));
        assertEquals(10946, Fibonacci.fibIter(21));
        assertEquals(17711, Fibonacci.fibIter(22));
        assertEquals(28657, Fibonacci.fibIter(23));
        assertEquals(46368, Fibonacci.fibIter(24));
        assertEquals(75025, Fibonacci.fibIter(25));
        assertEquals(121393, Fibonacci.fibIter(26));
        assertEquals(196418, Fibonacci.fibIter(27));
        assertEquals(317811, Fibonacci.fibIter(28));
        assertEquals(514229, Fibonacci.fibIter(29));
        assertEquals(832040, Fibonacci.fibIter(30));
        assertEquals(1346269, Fibonacci.fibIter(31));
        assertEquals(2178309, Fibonacci.fibIter(32));
        assertEquals(3524578, Fibonacci.fibIter(33));
        assertEquals(5702887, Fibonacci.fibIter(34));
        assertEquals(9227465, Fibonacci.fibIter(35));
        assertEquals(14930352, Fibonacci.fibIter(36));
        assertEquals(24157817, Fibonacci.fibIter(37));
        assertEquals(39088169, Fibonacci.fibIter(38));
        assertEquals(63245986, Fibonacci.fibIter(39));
        assertEquals(102334155, Fibonacci.fibIter(40));
        assertEquals(165580141, Fibonacci.fibIter(41));
        assertEquals(267914296, Fibonacci.fibIter(42));
        assertEquals(433494437, Fibonacci.fibIter(43));
        assertEquals(701408733, Fibonacci.fibIter(44));
        assertEquals(1134903170, Fibonacci.fibIter(45));
    }
}