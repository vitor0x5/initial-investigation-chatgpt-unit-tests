package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ord = new Ordenacao();
        assertNotNull(ord);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 8, 3, 1};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, v);
    }
}