package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Ordenacao;

public class OrdenacaoTest5{


    // Test for the default constructor
    @Test(expected=Exception.class, timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
    
    // Test for the ordena method with valid inputs
    @Test(expected=Exception.class, timeout=1000)
    public void testOrdenaValidInputs() throws Exception {
        int[] v = {5, 2, 8, 1, 6};
        int n = 5;
        Ordenacao.ordena(v, n);
        
        int[] expected = {1, 2, 5, 6, 8};
        assertArrayEquals(expected, v);
    }
    
    // Test for the ordena method with empty array
    @Test(expected=Exception.class, timeout=1000)
    public void testOrdenaEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        Ordenacao.ordena(v, n);
        
        int[] expected = {};
        assertArrayEquals(expected, v);
    }
    
    // Test for the ordena method with single element array
    @Test(expected=Exception.class, timeout=1000)
    public void testOrdenaSingleElementArray() throws Exception {
        int[] v = {3};
        int n = 1;
        Ordenacao.ordena(v, n);
        
        int[] expected = {3};
        assertArrayEquals(expected, v);
    }
    
    // Test for the ordena method with all elements being equal
    @Test(expected=Exception.class, timeout=1000)
    public void testOrdenaAllElementsEqual() throws Exception {
        int[] v = {2, 2, 2, 2, 2};
        int n = 5;
        Ordenacao.ordena(v, n);
        
        int[] expected = {2, 2, 2, 2, 2};
        assertArrayEquals(expected, v);
    }
    
    // Test for the ordena method with negative values
    @Test(expected=Exception.class, timeout=1000)
    public void testOrdenaNegativeValues() throws Exception {
        int[] v = {-5, -2, -8, -1, -6};
        int n = 5;
        Ordenacao.ordena(v, n);
        
        int[] expected = {-8, -6, -5, -2, -1};
        assertArrayEquals(expected, v);
    }
    
    // Test for the ordena method with boundary values
    @Test(expected=Exception.class, timeout=1000)
    public void testOrdenaBoundaryValues() throws Exception {
        int[] v = {-100, 0, 100};
        int n = 3;
        Ordenacao.ordena(v, n);
        
        int[] expected = {-100, 0, 100};
        assertArrayEquals(expected, v);
    }
}