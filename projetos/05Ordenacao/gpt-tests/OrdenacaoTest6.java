package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest6{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ord = new Ordenacao();
        assertNotNull(ord);
    }

    // Test for the ordena method
    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] arr1 = {};
        Ordenacao.ordena(arr1, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test with single element in array
        int[] arr2 = {5};
        Ordenacao.ordena(arr2, 1);
        assertArrayEquals(new int[]{5}, arr2);

        // Test with array sorted in ascending order
        int[] arr3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test with array sorted in descending order
        int[] arr4 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arr4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr4);

        // Test with array containing duplicate values
        int[] arr5 = {5, 2, 3, 1, 5, 4};
        Ordenacao.ordena(arr5, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5}, arr5);

        // Test with negative values
        int[] arr6 = {-5, -2, -3, -1, -4};
        Ordenacao.ordena(arr6, 5);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, arr6);
    }
}