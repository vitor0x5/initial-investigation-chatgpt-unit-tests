package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest2{


    @Test
    public void testMergeSort() {
        // Test case 1: empty array
        int[] arr1 = {};
        Ordenacao.mergeSort(arr1, 0, 0);
        assertArrayEquals(new int[]{}, arr1);

        // Test case 2: already sorted array
        int[] arr2 = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(arr2, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr2);

        // Test case 3: reverse sorted array
        int[] arr3 = {5, 4, 3, 2, 1};
        Ordenacao.mergeSort(arr3, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test case 4: array with duplicate elements
        int[] arr4 = {5, 3, 2, 5, 1};
        Ordenacao.mergeSort(arr4, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5}, arr4);
    }
}