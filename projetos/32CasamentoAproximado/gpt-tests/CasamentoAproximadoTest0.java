package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest0{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamento = new CasamentoAproximado();
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "bcd";
        int m = 3;
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximadoWithEmptyText() throws Exception {
        String T = "";
        int n = 0;
        String P = "bcd";
        int m = 3;
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximadoWithEmptyPattern() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "";
        int m = 0;
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximadoWithZeroErrors() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "bcd";
        int m = 3;
        int k = 0;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout = 1000)
    public void testShiftAndAproximadoWithNegativeK() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "bcd";
        int m = 3;
        int k = -1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}