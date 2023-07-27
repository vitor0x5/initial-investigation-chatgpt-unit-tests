package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest4{


    // Test for default constructor
    @Test( timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    // Test for mergeSort method with valid inputs
    @Test( timeout = 1000)
    public void testMergeSortValidInputs() throws Exception {
        int[] arr = {5, 2, 7, 1, 8};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 5, 7, 8};
        assertArrayEquals(expected, arr);
    }

    // Test for mergeSort method with empty array
    @Test( timeout = 1000)
    public void testMergeSortEmptyArray() throws Exception {
        int[] arr = {};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }

    // Test for mergeSort method with single element array
    @Test( timeout = 1000)
    public void testMergeSortSingleElementArray() throws Exception {
        int[] arr = {5};
        Ordenacao.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {5};
        assertArrayEquals(expected, arr);
    }

}