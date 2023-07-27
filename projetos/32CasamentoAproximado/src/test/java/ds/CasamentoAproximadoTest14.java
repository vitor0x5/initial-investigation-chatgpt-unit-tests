package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamento = new CasamentoAproximado();
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "bcd";
        int m = 3;
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }

    @Test(timeout=1000)
    public void testShiftAndAproximadoPositiveValues() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "bcd";
        int m = 3;
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}