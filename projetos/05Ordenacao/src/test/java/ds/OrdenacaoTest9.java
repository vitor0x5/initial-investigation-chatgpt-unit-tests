package ds;import static org.junit.Assert.*;
import org.junit.Test;
public class OrdenacaoTest9{

    @Test(timeout=1000)
    public void testOrdenaDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
    
    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        int[] v = {1, 5, 2, 4, 3};
        int n = v.length;
        Ordenacao.ordena(v, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }
    
    @Test(timeout=1000)
    public void testOrdenaWithEmptyArray() throws Exception {
        int[] v = {};
        int n = v.length;
        Ordenacao.ordena(v, n);
        assertArrayEquals(new int[]{}, v);
    }
    
    @Test(timeout=1000)
    public void testOrdenaWithSingleElementArray() throws Exception {
        int[] v = {4};
        int n = v.length;
        Ordenacao.ordena(v, n);
        assertArrayEquals(new int[]{4}, v);
    }
    
    @Test(timeout=1000)
    public void testOrdenaWithNegativeValues() throws Exception {
        int[] v = {-4, 2, -1, 3, -2};
        int n = v.length;
        Ordenacao.ordena(v, n);
        assertArrayEquals(new int[]{-4, -2, -1, 2, 3}, v);
    }
    
    @Test(timeout=1000)
    public void testOrdenaWithBoundaryValues() throws Exception {
        int[] v = {-3, 0, 4, -5, 2};
        int n = v.length;
        Ordenacao.ordena(v, n);
        assertArrayEquals(new int[]{-5, -3, 0, 2, 4}, v);
    }
}