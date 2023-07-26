package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class CasamentoExatoTest10{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
        assertNotNull(ce);
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "c";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // add assertions

    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "c";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // add assertions

    }

    @Test(timeout=1000)
    public void testBmh() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "c";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // add assertions

    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "c";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // add assertions

    }
}