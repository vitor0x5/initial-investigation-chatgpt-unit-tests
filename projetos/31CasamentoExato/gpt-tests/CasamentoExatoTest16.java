package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato casamentoExato = new CasamentoExato();
        assertNotNull(casamentoExato);
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bc";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);
        // Add assertion here
    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bc";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add assertion here
    }

    @Test(timeout=1000)
    public void testBmh() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bc";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);
        // Add assertion here
    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "bc";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);
        // Add assertion here
    }
}