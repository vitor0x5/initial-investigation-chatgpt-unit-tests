package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class CasamentoAproximadoTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado ca = new CasamentoAproximado();
        assertNotNull(ca);
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
    public void testShiftAndAproximadoWithEmptyPattern() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyText() throws Exception {
        String T = "";
        int n = T.length();
        String P = "bcd";
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

    @Test(expected = NullPointerException.class, timeout=1000)
    public void testShiftAndAproximadoWithNullText() throws Exception {
        String T = null;
        int n = 0;
        String P = "bcd";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}