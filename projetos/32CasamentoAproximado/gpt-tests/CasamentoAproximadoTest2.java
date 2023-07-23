package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest2{


    @Test
    public void testShiftAndAproximado() {
        String T = "This is a test string";
        String P = "test";
        int k = 2;
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);

        // Add assertions here to verify the output or behavior
    }
}