package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoExatoTest0{


    @Test
    public void testForcaBruta() {
        String T = "This is a test string";
        String P = "test";
        int n = T.length();
        int m = P.length();
        
        CasamentoExato.forcaBruta(T, n, P, m);
        
        // Add assertions for the expected output or behavior
    }
    
    @Test
    public void testShiftAndExato() {
        String T = "This is a test string";
        String P = "test";
        int n = T.length();
        int m = P.length();
        
        CasamentoExato.shiftAndExato(T, n, P, m);
        
        // Add assertions for the expected output or behavior
    }
    
    @Test
    public void testBmh() {
        String T = "This is a test string";
        String P = "test";
        int n = T.length();
        int m = P.length();
        
        CasamentoExato.bmh(T, n, P, m);
        
        // Add assertions for the expected output or behavior
    }
    
    @Test
    public void testBmhs() {
        String T = "This is a test string";
        String P = "test";
        int n = T.length();
        int m = P.length();
        
        CasamentoExato.bmhs(T, n, P, m);
        
        // Add assertions for the expected output or behavior
    }
}