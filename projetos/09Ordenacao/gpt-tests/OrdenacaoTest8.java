package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 8, 4, 1};
        Ordenacao.mergeSort(v, 0, 4);
        int[] expected = {1, 2, 4, 5, 8};
        assertArrayEquals(expected, v);
    }
}