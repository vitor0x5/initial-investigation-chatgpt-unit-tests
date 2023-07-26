package ds;import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CasamentoAproximadoTest6{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        new CasamentoAproximado();
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 2;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado_WithEmptyText() throws Exception {
        String T = "";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 2;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado_WithEmptyPattern() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 2;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado_WithZeroErrorLimit() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = 0;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado_WithNegativeErrorLimit() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "bcd";
        int m = P.length();
        int k = -2;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}