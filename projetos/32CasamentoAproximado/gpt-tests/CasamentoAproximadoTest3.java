package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest3{

    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado ca = new CasamentoAproximado();
    }
    
    @Test(timeout = 1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "abc";
        int m = 3;
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
    
    @Test(timeout = 1000)
    public void testShiftAndAproximado_WithBoundaryValues() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "abc";
        int m = 3;
        int k = 0;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
        
        k = 2;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
    
    @Test(timeout = 1000)
    public void testShiftAndAproximado_WithNegativeValues() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "abc";
        int m = 3;
        int k = -1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}