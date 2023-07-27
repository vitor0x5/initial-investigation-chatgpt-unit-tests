package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest22{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ord = new Ordenacao();
        assertNotNull(ord);
    }

    @Test(timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {5, 2, 4, 1, 3};
        Ordenacao.mergeSort(v, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v);
    }
}