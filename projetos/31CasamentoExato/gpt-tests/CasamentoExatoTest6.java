package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest6{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
        assertNotNull(ce);
    }

    // Test for forcaBruta method
    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "test";
        int n = T.length();
        String P = "es";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Assertions can be added here if needed
    }

    // Test for shiftAndExato method
    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "test";
        int n = T.length();
        String P = "es";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Assertions can be added here if needed
    }

    // Test for bmh method
    @Test(timeout=1000)
    public void testBMH() throws Exception {
        String T = "test";
        int n = T.length();
        String P = "es";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Assertions can be added here if needed
    }

    // Test for bmhs method
    @Test(timeout=1000)
    public void testBMHS() throws Exception {
        String T = "test";
        int n = T.length();
        String P = "es";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Assertions can be added here if needed
    }
}