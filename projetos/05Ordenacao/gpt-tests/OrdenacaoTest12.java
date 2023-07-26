package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test case with empty array
        int[] v1 = {};
        Ordenacao.ordena(v1, 0);
        assertArrayEquals(new int[]{}, v1);

        // Test case with one element
        int[] v2 = {5};
        Ordenacao.ordena(v2, 1);
        assertArrayEquals(new int[]{5}, v2);

        // Test case with two elements in ascending order
        int[] v3 = {3, 7};
        Ordenacao.ordena(v3, 2);
        assertArrayEquals(new int[]{3, 7}, v3);

        // Test case with two elements in descending order
        int[] v4 = {9, 2};
        Ordenacao.ordena(v4, 2);
        assertArrayEquals(new int[]{2, 9}, v4);

        // Test case with three elements in ascending order
        int[] v5 = {1, 4, 8};
        Ordenacao.ordena(v5, 3);
        assertArrayEquals(new int[]{1, 4, 8}, v5);

        // Test case with three elements in descending order
        int[] v6 = {6, 3, 2};
        Ordenacao.ordena(v6, 3);
        assertArrayEquals(new int[]{2, 3, 6}, v6);

        // Test case with three elements in random order
        int[] v7 = {5, 1, 7};
        Ordenacao.ordena(v7, 3);
        assertArrayEquals(new int[]{1, 5, 7}, v7);
    }
}