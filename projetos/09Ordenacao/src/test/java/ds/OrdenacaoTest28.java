package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest28{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {6, 5, 4, 3, 2, 1};
        Ordenacao.mergeSort(v, 0, 5);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, v);
    }
}