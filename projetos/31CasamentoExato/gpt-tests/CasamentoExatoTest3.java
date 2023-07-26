package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CasamentoExatoTest3{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato casamentoExato = new CasamentoExato();
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cde";
        int m = 3;

        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cde";
        int m = 3;

        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testBmh() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cde";
        int m = 3;

        CasamentoExato.bmh(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cde";
        int m = 3;

        CasamentoExato.bmhs(T, n, P, m);
    }
}