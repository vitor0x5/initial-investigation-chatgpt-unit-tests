package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado casamento = new CasamentoAproximado();
    }

    @Test(timeout=1000)
    public void testShiftAndAproximado() throws Exception {
        String T = "abababa";
        int n = T.length();
        String P = "aba";
        int m = P.length();
        int k = 1;

        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    }
}