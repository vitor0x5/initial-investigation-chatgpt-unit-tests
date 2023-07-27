package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest10{


    // Test for default constructor
    @Test( timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    // Test mergeSort method with true and false values for conditional expressions
    @Test( timeout=1000)
    public void testMergeSort() throws Exception {
        int[] v = {7, 3, 9, 2, 5};
        Ordenacao.mergeSort(v, 0, 4);
        assertArrayEquals(new int[]{2, 3, 5, 7, 9}, v);
    }
}