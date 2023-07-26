package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest11{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Ordenacao ord = new Ordenacao();
    assertNotNull(ord);
  }

  @Test(timeout=1000)
  public void testMergeSort() throws Exception {
    // Test case 1: Empty array
    int[] arr1 = {};
    Ordenacao.mergeSort(arr1, 0, 0);
    assertArrayEquals(new int[]{}, arr1);

    // Test case 2: Array with one element
    int[] arr2 = {5};
    Ordenacao.mergeSort(arr2, 0, 0);
    assertArrayEquals(new int[]{5}, arr2);

    // Test case 3: Array with two elements (already sorted)
    int[] arr3 = {3, 8};
    Ordenacao.mergeSort(arr3, 0, 1);
    assertArrayEquals(new int[]{3, 8}, arr3);

    // Test case 4: Array with two elements (not sorted)
    int[] arr4 = {9, 4};
    Ordenacao.mergeSort(arr4, 0, 1);
    assertArrayEquals(new int[]{4, 9}, arr4);

    // Test case 5: Array with three elements (already sorted)
    int[] arr5 = {1, 5, 9};
    Ordenacao.mergeSort(arr5, 0, 2);
    assertArrayEquals(new int[]{1, 5, 9}, arr5);

    // Test case 6: Array with three elements (not sorted)
    int[] arr6 = {7, 2, 6};
    Ordenacao.mergeSort(arr6, 0, 2);
    assertArrayEquals(new int[]{2, 6, 7}, arr6);

    // Test case 7: Array with positive and negative values
    int[] arr7 = {6, -4, 2, -9, 0, 8};
    Ordenacao.mergeSort(arr7, 0, 5);
    assertArrayEquals(new int[]{-9, -4, 0, 2, 6, 8}, arr7);
  }

  // Additional test cases can be added for the other methods if needed
}