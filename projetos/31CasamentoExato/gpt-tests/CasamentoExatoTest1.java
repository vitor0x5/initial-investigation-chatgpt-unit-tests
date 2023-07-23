package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest1{


    @Test
    public void testForcaBruta() {
        String T = "abababa";
        int n = T.length();
        String P = "aba";
        int m = P.length();

        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test
    public void testShiftAndExato() {
        String T = "abababa";
        int n = T.length();
        String P = "aba";
        int m = P.length();

        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test
    public void testBmh() {
        String T = "abababa";
        int n = T.length();
        String P = "aba";
        int m = P.length();

        CasamentoExato.bmh(T, n, P, m);
    }

    @Test
    public void testBmhs() {
        String T = "abababa";
        int n = T.length();
        String P = "aba";
        int m = P.length();

        CasamentoExato.bmhs(T, n, P, m);
    }
}