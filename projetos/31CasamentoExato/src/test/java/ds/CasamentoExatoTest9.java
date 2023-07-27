package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CasamentoExatoTest9{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
        assertNotNull(ce);
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "abcababcabcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcababcabcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testBmh() throws Exception {
        String T = "abcababcabcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "abcababcabcabc";
        int n = T.length();
        String P = "abc";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);
        // Add assertions here
    }
}