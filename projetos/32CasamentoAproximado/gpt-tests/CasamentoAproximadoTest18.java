package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest18{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
        assertNotNull(casamentoAproximado);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cde";
        int m = 3;
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}