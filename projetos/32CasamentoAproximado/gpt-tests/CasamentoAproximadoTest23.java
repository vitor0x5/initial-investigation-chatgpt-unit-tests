package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
        assertNotNull(casamentoAproximado);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado_WithEmptyPattern() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado_WithEmptyText() throws Exception {
        String T = "";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado_WithZeroK() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 0;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado_WithNegativeK() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = -1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}