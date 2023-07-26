package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class CasamentoExatoTest11{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testForcaBruta() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testBmh() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testBmhs() throws Exception {
        String T = "abcde";
        int n = T.length();
        String P = "cd";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);
    }
}