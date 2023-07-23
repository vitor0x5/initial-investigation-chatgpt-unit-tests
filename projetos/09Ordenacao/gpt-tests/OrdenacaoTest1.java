package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest1{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 8, 1, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        int[] expected = {1, 2, 5, 8, 9};
        assertArrayEquals(expected, input);
    }
}