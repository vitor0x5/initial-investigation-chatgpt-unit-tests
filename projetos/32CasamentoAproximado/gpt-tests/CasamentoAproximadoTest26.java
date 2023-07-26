package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest26{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamento = new CasamentoAproximado();
        assertNotNull(casamento);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abracadabra";
        int n = T.length();
        String P = "abra";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyText() throws Exception {
        String T = "";
        int n = T.length();
        String P = "abra";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyPattern() throws Exception {
        String T = "abracadabra";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithZeroErrors() throws Exception {
        String T = "abracadabra";
        int n = T.length();
        String P = "abra";
        int m = P.length();
        int k = 0;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithNegativeErrors() throws Exception {
        String T = "abracadabra";
        int n = T.length();
        String P = "abra";
        int m = P.length();
        int k = -1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithBoundaryValues() throws Exception {
        String T = "abracadabra";
        int n = T.length();
        String P = "abra";
        int m = P.length();
        int k = Integer.MAX_VALUE;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}