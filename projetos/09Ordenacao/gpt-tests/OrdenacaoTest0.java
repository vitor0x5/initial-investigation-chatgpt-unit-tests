package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest0{

  
  @Test
  public void testMergeSort() {
    int[] arr = {5, 2, 8, 3, 1};
    int[] expected = {1, 2, 3, 5, 8};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortEmptyArray() {
    int[] arr = {};
    int[] expected = {};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortAlreadySortedArray() {
    int[] arr = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testMergeSortSingleElementArray() {
    int[] arr = {5};
    int[] expected = {5};
    Ordenacao.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
}