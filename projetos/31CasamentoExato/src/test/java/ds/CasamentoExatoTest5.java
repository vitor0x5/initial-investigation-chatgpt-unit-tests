package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class CasamentoExatoTest5{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
        assertNotNull(ce);
    }
    
    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.forcaBruta(T, n, P, m);
        // Add more test cases for different values of T and P
    }
    
    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Add more test cases for different values of T and P
    }
    
    @Test(timeout=1000)
    public void testBmh() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.bmh(T, n, P, m);
        // Add more test cases for different values of T and P
    }
    
    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        String T = "abcdefg";
        int n = T.length();
        String P = "def";
        int m = P.length();
        CasamentoExato.bmhs(T, n, P, m);
        // Add more test cases for different values of T and P
    }
}