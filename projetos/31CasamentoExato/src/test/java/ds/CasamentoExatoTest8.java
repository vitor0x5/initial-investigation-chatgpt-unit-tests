package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato casamentoExato = new CasamentoExato();
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "";
        int n = 0;
        String P = "";
        int m = 0;
        CasamentoExato.forcaBruta(T, n, P, m);

        T = "abc";
        n = 3;
        P = "a";
        m = 1;
        CasamentoExato.forcaBruta(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "";
        int n = 0;
        String P = "";
        int m = 0;
        CasamentoExato.shiftAndExato(T, n, P, m);

        T = "abc";
        n = 3;
        P = "a";
        m = 1;
        CasamentoExato.shiftAndExato(T, n, P, m);
    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "";
        int n = 0;
        String P = "";
        int m = 0;
        CasamentoExato.bmhs(T, n, P, m);

        T = "abc";
        n = 3;
        P = "a";
        m = 1;
        CasamentoExato.bmhs(T, n, P, m);
    }
}