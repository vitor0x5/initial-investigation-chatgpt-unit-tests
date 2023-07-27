package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 7, 1, 3};
        Ordenacao.mergeSort(v, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 5, 7}, v);
    }
}