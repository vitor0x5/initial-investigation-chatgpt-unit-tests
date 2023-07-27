package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 3, 8, 2, 1};
        Ordenacao.mergeSort(v, 0, v.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, v);
    }
}