package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest25{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 3, 1, 4, 2};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }
}