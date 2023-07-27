package ds;import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OrdenacaoTest7{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        // No assertions needed as it is testing only the constructor
    }

    @Test(timeout = 1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 8, 3, 1};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, v);

        int[] v2 = {-5, -2, -8, -3, -1};
        Ordenacao.mergeSort(v2, 0, 4);
        int[] expected2 = {-8, -5, -3, -2, -1};
        assertArrayEquals(expected2, v2);
    }
}