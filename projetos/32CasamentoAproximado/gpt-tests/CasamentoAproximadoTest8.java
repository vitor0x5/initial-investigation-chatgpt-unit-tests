package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
        assertNotNull(casamentoAproximado);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcdabcdabcd";
        int n = T.length();
        String P = "abc";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}