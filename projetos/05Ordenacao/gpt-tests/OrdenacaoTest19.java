package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest19{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao o = new Ordenacao();
        assertNotNull(o);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] emptyArray = {};
        Ordenacao.ordena(emptyArray, 0);
        assertArrayEquals(new int[]{}, emptyArray);

        // Test with array of size 1
        int[] array1 = {5};
        Ordenacao.ordena(array1, 1);
        assertArrayEquals(new int[]{5}, array1);

        // Test with array of size 2
        int[] array2 = {9, 2};
        Ordenacao.ordena(array2, 2);
        assertArrayEquals(new int[]{2, 9}, array2);

        // Test with array of size 3
        int[] array3 = {4, -1, 7};
        Ordenacao.ordena(array3, 3);
        assertArrayEquals(new int[]{-1, 4, 7}, array3);

        // Test with array of size 4
        int[] array4 = {6, -3, 0, 2};
        Ordenacao.ordena(array4, 4);
        assertArrayEquals(new int[]{-3, 0, 2, 6}, array4);

        // Test with array of size 5
        int[] array5 = {1, -5, 3, 8, -2};
        Ordenacao.ordena(array5, 5);
        assertArrayEquals(new int[]{-5, -2, 1, 3, 8}, array5);
    }
}