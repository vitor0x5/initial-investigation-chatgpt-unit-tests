package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 8, 1, 9};
        Ordenacao.mergeSort(v, 0, v.length-1);
        assertArrayEquals(new int[]{1, 2, 5, 8, 9}, v);
    }
}