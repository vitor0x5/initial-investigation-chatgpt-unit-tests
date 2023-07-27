package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest30{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamento = new CasamentoAproximado();
        assertNotNull(casamento);
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
    public void testShiftAndAproximadoWithEmptyString() throws Exception {
        String T = "";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyPattern() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithZeroK() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 0;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}