package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest2{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    // Test for the ordena method
    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] emptyArray = {};
        Ordenacao.ordena(emptyArray, 0);
        assertArrayEquals(new int[]{}, emptyArray);

        // Test with array of size 1
        int[] arraySize1 = {1};
        Ordenacao.ordena(arraySize1, 1);
        assertArrayEquals(new int[]{1}, arraySize1);

        // Test with array of size 2
        int[] arraySize2 = {2, 1};
        Ordenacao.ordena(arraySize2, 2);
        assertArrayEquals(new int[]{1, 2}, arraySize2);

        // Test with array of size 3
        int[] arraySize3 = {3, 2, 1};
        Ordenacao.ordena(arraySize3, 3);
        assertArrayEquals(new int[]{1, 2, 3}, arraySize3);

        // Test with array of size 4
        int[] arraySize4 = {4, 3, 2, 1};
        Ordenacao.ordena(arraySize4, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arraySize4);

        // Test with array of size 5
        int[] arraySize5 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(arraySize5, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySize5);
    }
}