package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest17{


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

        // Test with single element array
        int[] v2 = {5};
        Ordenacao.ordena(v2, 1);
        assertArrayEquals(new int[]{5}, v2);

        // Test with already sorted array
        int[] v3 = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v3);

        // Test with reverse sorted array
        int[] v4 = {5, 4, 3, 2, 1};
        Ordenacao.ordena(v4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v4);

        // Test with random array
        int[] v5 = {4, 2, 5, 1, 3};
        Ordenacao.ordena(v5, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v5);

        // Test with negative values
        int[] v6 = {-4, -2, -5, -1, -3};
        Ordenacao.ordena(v6, 5);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, v6);

        // Test with duplicate values
        int[] v7 = {4, 2, 5, 1, 3, 2, 5};
        Ordenacao.ordena(v7, 7);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 5}, v7);
    }
}