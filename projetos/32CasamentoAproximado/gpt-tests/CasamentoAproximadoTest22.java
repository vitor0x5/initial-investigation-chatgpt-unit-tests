package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest22{


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
        // Add assertions here if necessary
    }
}