package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest0{


    @Test
    public void testShiftAndAproximado() {
        String T = "abracadabra";
        String P = "abra";
        int k = 1;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    }
}