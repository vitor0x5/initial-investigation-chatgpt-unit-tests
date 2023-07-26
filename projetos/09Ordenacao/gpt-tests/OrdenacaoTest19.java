package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest19{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
    
    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 7, 1, 3};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {1, 2, 3, 5, 7};
        assertArrayEquals(expected, v);
    }
}