package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {6, 3, 9, 1, 5, 2};
        int i = 0;
        int j = 5;

        Ordenacao.mergeSort(v, i, j);

        int[] expected = {1, 2, 3, 5, 6, 9};
        assertArrayEquals(expected, v);
    }
}