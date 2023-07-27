package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest7{


    @Test
    public void testDefaultConstructor() throws Exception {
        CasamentoExato ce = new CasamentoExato();
    }

    @Test(timeout = 1000)
    public void testForcaBruta() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cd";
        int m = 2;
        
        // Test case 1
        CasamentoExato.forcaBruta(T, n, P, m);
        // Test case 2
        CasamentoExato.forcaBruta("", 0, "", 0);
        // Test case 3
        CasamentoExato.forcaBruta("abcde", 5, "abcde", 5);
    }

    @Test(timeout = 1000)
    public void testShiftAndExato() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cd";
        int m = 2;
        
        // Test case 1
        CasamentoExato.shiftAndExato(T, n, P, m);
        // Test case 2
        CasamentoExato.shiftAndExato("", 0, "", 0);
        // Test case 3
        CasamentoExato.shiftAndExato("abcde", 5, "abcde", 5);
    }

    @Test(timeout = 1000)
    public void testBmhs() throws Exception {
        String T = "abcde";
        int n = 5;
        String P = "cd";
        int m = 2;
        
        // Test case 1
        CasamentoExato.bmhs(T, n, P, m);
        // Test case 2
        CasamentoExato.bmhs("", 0, "", 0);
        // Test case 3
        CasamentoExato.bmhs("abcde", 5, "abcde", 5);
    }

}