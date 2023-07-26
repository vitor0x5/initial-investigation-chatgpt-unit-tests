package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest15{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
        assertNotNull(casamentoAproximado);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcdab";
        int n = T.length();
        String P = "ab";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyText() throws Exception {
        String T = "";
        int n = T.length();
        String P = "ab";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyPattern() throws Exception {
        String T = "abcdab";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithEmptyTextAndPattern() throws Exception {
        String T = "";
        int n = T.length();
        String P = "";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithNegativeK() throws Exception {
        String T = "abcdab";
        int n = T.length();
        String P = "ab";
        int m = P.length();
        int k = -1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithZeroK() throws Exception {
        String T = "abcdab";
        int n = T.length();
        String P = "ab";
        int m = P.length();
        int k = 0;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithMaxCharPattern() throws Exception {
        String T = "abcdab";
        int n = T.length();
        String P = String.valueOf(Character.MAX_VALUE);
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithMaxCharText() throws Exception {
        String T = String.valueOf(Character.MAX_VALUE);
        int n = T.length();
        String P = "ab";
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoWithMaxCharPatternAndText() throws Exception {
        String T = String.valueOf(Character.MAX_VALUE);
        int n = T.length();
        String P = String.valueOf(Character.MAX_VALUE);
        int m = P.length();
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}