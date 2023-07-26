package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] emptyArray = {};
        Ordenacao.ordena(emptyArray, 0);
        assertArrayEquals(new int[]{}, emptyArray);

        // Test with array of size 1
        int[] arraySize1 = {5};
        Ordenacao.ordena(arraySize1, 1);
        assertArrayEquals(new int[]{5}, arraySize1);

        // Test with array of size 2
        int[] arraySize2 = {5, 3};
        Ordenacao.ordena(arraySize2, 2);
        assertArrayEquals(new int[]{3, 5}, arraySize2);

        // Test with array of size 3
        int[] arraySize3 = {5, 3, 7};
        Ordenacao.ordena(arraySize3, 3);
        assertArrayEquals(new int[]{3, 5, 7}, arraySize3);

        // Test with array of size 4
        int[] arraySize4 = {5, 3, 7, 2};
        Ordenacao.ordena(arraySize4, 4);
        assertArrayEquals(new int[]{2, 3, 5, 7}, arraySize4);

        // Test with array of size 5
        int[] arraySize5 = {5, 3, 7, 2, 4};
        Ordenacao.ordena(arraySize5, 5);
        assertArrayEquals(new int[]{2, 3, 4, 5, 7}, arraySize5);
    }
}