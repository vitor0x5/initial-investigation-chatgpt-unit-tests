package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test with single element array
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test with sorted array
        int[] arr3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test with reverse sorted array
        int[] arr4 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr4);

        // Test with random array
        int[] arr5 = {3, 5, 1, 4, 2};
        Ordenacao.ordena(arr5, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr5);

        // Test with negative values
        int[] arr6 = {-5, -4, -3, -2, -1};
        Ordenacao.ordena(arr6, 5);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, arr6);

        // Test with boundary values
        int[] arr7 = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        Ordenacao.ordena(arr7, 3);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, arr7);
    }
}