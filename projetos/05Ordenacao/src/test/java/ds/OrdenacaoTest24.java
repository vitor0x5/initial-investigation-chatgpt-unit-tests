package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest24{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] v1 = {};
        Ordenacao.ordena(v1, 0);
        assertArrayEquals(new int[]{}, v1);

        // Test with array of size 1
        int[] v2 = {5};
        Ordenacao.ordena(v2, 1);
        assertArrayEquals(new int[]{5}, v2);

        // Test with array of size 2 in ascending order
        int[] v3 = {1, 2};
        Ordenacao.ordena(v3, 2);
        assertArrayEquals(new int[]{1, 2}, v3);

        // Test with array of size 2 in descending order
        int[] v4 = {2, 1};
        Ordenacao.ordena(v4, 2);
        assertArrayEquals(new int[]{1, 2}, v4);

        // Test with array of size 3 in ascending order
        int[] v5 = {1, 2, 3};
        Ordenacao.ordena(v5, 3);
        assertArrayEquals(new int[]{1, 2, 3}, v5);

        // Test with array of size 3 in descending order
        int[] v6 = {3, 2, 1};
        Ordenacao.ordena(v6, 3);
        assertArrayEquals(new int[]{1, 2, 3}, v6);

        // Test with array of size 3 in random order
        int[] v7 = {2, 3, 1};
        Ordenacao.ordena(v7, 3);
        assertArrayEquals(new int[]{1, 2, 3}, v7);

        // Test with array of size 5 in random order
        int[] v8 = {5, 2, 4, 1, 3};
        Ordenacao.ordena(v8, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v8);

        // Test with array of size 5 with duplicate values
        int[] v9 = {5, 2, 4, 2, 3};
        Ordenacao.ordena(v9, 5);
        assertArrayEquals(new int[]{2, 2, 3, 4, 5}, v9);

        // Test with array of size 10 with negative values
        int[] v10 = {-5, -2, -4, -1, -3, 0, 1, 3, 2, 4};
        Ordenacao.ordena(v10, 10);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4}, v10);
    }
}