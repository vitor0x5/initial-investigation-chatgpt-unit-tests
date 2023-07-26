package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao o = new Ordenacao();
        assertNotNull(o);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test case with n = 0
        int[] v1 = {};
        Ordenacao.ordena(v1, 0);
        assertArrayEquals(new int[]{}, v1);

        // Test case with n = 1
        int[] v2 = {5};
        Ordenacao.ordena(v2, 1);
        assertArrayEquals(new int[]{5}, v2);

        // Test case with n = 2 and v[0] < v[1]
        int[] v3 = {3, 7};
        Ordenacao.ordena(v3, 2);
        assertArrayEquals(new int[]{3, 7}, v3);

        // Test case with n = 2 and v[0] > v[1]
        int[] v4 = {9, 2};
        Ordenacao.ordena(v4, 2);
        assertArrayEquals(new int[]{2, 9}, v4);

        // Test case with n = 3 and all elements are already sorted
        int[] v5 = {1, 2, 3};
        Ordenacao.ordena(v5, 3);
        assertArrayEquals(new int[]{1, 2, 3}, v5);

        // Test case with n = 3 and all elements are in reverse order
        int[] v6 = {5, 3, 1};
        Ordenacao.ordena(v6, 3);
        assertArrayEquals(new int[]{1, 3, 5}, v6);

        // Test case with n = 4 and all elements are the same
        int[] v7 = {4, 4, 4, 4};
        Ordenacao.ordena(v7, 4);
        assertArrayEquals(new int[]{4, 4, 4, 4}, v7);

        // Test case with n = 5 and random order
        int[] v8 = {2, 5, 3, 1, 4};
        Ordenacao.ordena(v8, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, v8);
    }
}