package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testMerge_AllTrue() throws Exception {
        int[] v = {1, 3, 2};
        int i = 0;
        int m = 1;
        int j = 2;
        Ordenacao.merge(v, i, m, j);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testMerge_AllFalse() throws Exception {
        int[] v = {3, 2, 1};
        int i = 0;
        int m = 1;
        int j = 2;
        Ordenacao.merge(v, i, m, j);
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testMergeSort_AllTrue() throws Exception {
        int[] v = {3, 1, 2};
        int i = 0;
        int j = 2;
        Ordenacao.mergeSort(v, i, j);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testMergeSort_AllFalse() throws Exception {
        int[] v = {2, 3, 1};
        int i = 0;
        int j = 2;
        Ordenacao.mergeSort(v, i, j);
        int[] expected = {2, 3, 1};
        assertArrayEquals(expected, v);
    }
}