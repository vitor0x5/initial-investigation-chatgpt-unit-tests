package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest25{


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
}