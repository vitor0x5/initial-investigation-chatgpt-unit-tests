package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        new Ordenacao();
    }

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

        // Test with array of size 2
        int[] arr3 = {3, 2};
        Ordenacao.ordena(arr3, 2);
        assertArrayEquals(new int[]{2, 3}, arr3);

        // Test with array of size 3
        int[] arr4 = {5, 1, 4};
        Ordenacao.ordena(arr4, 3);
        assertArrayEquals(new int[]{1, 4, 5}, arr4);

        // Test with array of size 4
        int[] arr5 = {7, 3, 9, 2};
        Ordenacao.ordena(arr5, 4);
        assertArrayEquals(new int[]{2, 3, 7, 9}, arr5);

        // Test with array of size 5
        int[] arr6 = {6, 1, 8, 4, 3};
        Ordenacao.ordena(arr6, 5);
        assertArrayEquals(new int[]{1, 3, 4, 6, 8}, arr6);
    }
}