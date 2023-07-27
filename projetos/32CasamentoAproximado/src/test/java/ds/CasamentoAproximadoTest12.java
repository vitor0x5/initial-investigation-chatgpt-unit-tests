package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest12{


    @Test
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
        assertNotNull(casamentoAproximado);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abababab";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        int k = 2;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}