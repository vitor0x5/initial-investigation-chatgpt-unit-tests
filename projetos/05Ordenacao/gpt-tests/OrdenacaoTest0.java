package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest0{


    @Test
    public void testOrdena() {
        int[] arr = {5, 3, 1, 4, 2};
        Ordenacao.ordena(arr, arr.length);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testOrdenaEmptyArray() {
        int[] arr = {};
        Ordenacao.ordena(arr, arr.length);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testOrdenaSingleElementArray() {
        int[] arr = {5};
        Ordenacao.ordena(arr, arr.length);
        int[] expected = {5};
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Ordenacao.ordena(arr, arr.length);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }
}