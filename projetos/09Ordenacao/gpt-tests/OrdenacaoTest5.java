package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSortWithEmptyArray() throws Exception {
        int[] v = new int[0];
        Ordenacao.mergeSort(v, 0, 0);
        assertArrayEquals(new int[0], v);
    }

    @Test(timeout=1000)
    public void testMergeSortWithOneElementArray() throws Exception {
        int[] v = {1};
        Ordenacao.mergeSort(v, 0, 0);
        assertArrayEquals(new int[]{1}, v);
    }

    @Test(timeout=1000)
    public void testMergeSortWithPositiveElements() throws Exception {
        int[] v = {5, 2, 9, 1, 3};
        Ordenacao.mergeSort(v, 0, v.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, v);
    }

    @Test(timeout=1000)
    public void testMergeSortWithNegativeElements() throws Exception {
        int[] v = {-5, -2, -9, -1, -3};
        Ordenacao.mergeSort(v, 0, v.length-1);
        assertArrayEquals(new int[]{-9, -5, -3, -2, -1}, v);
    }

    @Test(timeout=1000)
    public void testMergeSortWithMixedElements() throws Exception {
        int[] v = {-5, 2, -9, 1, -3};
        Ordenacao.mergeSort(v, 0, v.length-1);
        assertArrayEquals(new int[]{-9, -5, -3, 1, 2}, v);
    }

}