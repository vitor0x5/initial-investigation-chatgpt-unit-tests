package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest7{


    @Test( timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test( timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, arr1.length);
        assertArrayEquals(new int[]{}, arr1);

        // Test with one element array
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, arr2.length);
        assertArrayEquals(new int[]{5}, arr2);

        // Test with two element array in ascending order
        int[] arr3 = {2, 4};
        Ordenacao.ordena(arr3, arr3.length);
        assertArrayEquals(new int[]{2, 4}, arr3);

        // Test with two element array in descending order
        int[] arr4 = {6, 3};
        Ordenacao.ordena(arr4, arr4.length);
        assertArrayEquals(new int[]{3, 6}, arr4);

        // Test with three element array in ascending order
        int[] arr5 = {1, 3, 5};
        Ordenacao.ordena(arr5, arr5.length);
        assertArrayEquals(new int[]{1, 3, 5}, arr5);

        // Test with three element array in descending order
        int[] arr6 = {9, 7, 4};
        Ordenacao.ordena(arr6, arr6.length);
        assertArrayEquals(new int[]{4, 7, 9}, arr6);

        // Test with four element array
        int[] arr7 = {8, 2, 6, 1};
        Ordenacao.ordena(arr7, arr7.length);
        assertArrayEquals(new int[]{1, 2, 6, 8}, arr7);
    }
}