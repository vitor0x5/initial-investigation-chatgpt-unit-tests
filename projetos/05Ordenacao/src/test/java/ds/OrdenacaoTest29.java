package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest29{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test case with empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test case with single element array
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test case with already sorted array
        int[] arr3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test case with reverse sorted array
        int[] arr4 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr4);

        // Test case with duplicate elements
        int[] arr5 = {3, 2, 1, 2, 3};
        Ordenacao.ordena(arr5, 5);
        assertArrayEquals(new int[]{1, 2, 2, 3, 3}, arr5);

        // Test case with negative values
        int[] arr6 = {-5, -2, -10, -1, -3};
        Ordenacao.ordena(arr6, 5);
        assertArrayEquals(new int[]{-10, -5, -3, -2, -1}, arr6);

        // Test case with large array
        int[] arr7 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Ordenacao.ordena(arr7, 9);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr7);
    }
}