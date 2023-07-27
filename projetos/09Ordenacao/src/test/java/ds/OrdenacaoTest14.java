package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest14{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
    
    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 3, 1, 4, 2};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }
    
    @Test(timeout=1000)
    public void testMergeSortWithNegativeValues() throws Exception {
        int[] v = {-5, -3, -1, -4, -2};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {-5, -4, -3, -2, -1};
        assertArrayEquals(expected, v);
    }
    
    @Test(timeout=1000)
    public void testMergeSortWithBoundaryValues() throws Exception {
        int[] v = {0, 1, 2, 3, 4};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, v);
    }
}