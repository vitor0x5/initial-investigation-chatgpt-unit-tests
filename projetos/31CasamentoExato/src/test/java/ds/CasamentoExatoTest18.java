package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
        assertNotNull(ce);
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "ababab";
        int n = T.length();
        String P = "ab";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "ababab";
        int n = T.length();
        String P = "ab";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testBmh() throws Exception {
        String T = "ababab";
        int n = T.length();
        String P = "ab";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "ababab";
        int n = T.length();
        String P = "ab";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);
    }
}