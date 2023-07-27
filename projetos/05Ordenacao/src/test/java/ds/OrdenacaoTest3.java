package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest3{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    // Test for the ordena() method
    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test with array of size 1
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test with array of size 2 in ascending order
        int[] arr3 = {1, 2};
        Ordenacao.ordena(arr3, 2);
        assertArrayEquals(new int[]{1, 2}, arr3);

        // Test with array of size 2 in descending order
        int[] arr4 = {2, 1};
        Ordenacao.ordena(arr4, 2);
        assertArrayEquals(new int[]{1, 2}, arr4);

        // Test with array of size 3 in ascending order
        int[] arr5 = {1, 2, 3};
        Ordenacao.ordena(arr5, 3);
        assertArrayEquals(new int[]{1, 2, 3}, arr5);

        // Test with array of size 3 in descending order
        int[] arr6 = {3, 2, 1};
        Ordenacao.ordena(arr6, 3);
        assertArrayEquals(new int[]{1, 2, 3}, arr6);

        // Test with array of size 3 in random order
        int[] arr7 = {2, 3, 1};
        Ordenacao.ordena(arr7, 3);
        assertArrayEquals(new int[]{1, 2, 3}, arr7);

        // Test with array of size 5 with negative values
        int[] arr8 = {-5, -3, -1, -4, -2};
        Ordenacao.ordena(arr8, 5);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, arr8);

        // Test with array of size 5 with positive and negative values
        int[] arr9 = {-5, 3, -1, 4, -2};
        Ordenacao.ordena(arr9, 5);
        assertArrayEquals(new int[]{-5, -2, -1, 3, 4}, arr9);
    }
}