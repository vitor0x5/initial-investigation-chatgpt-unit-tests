package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest25{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
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

        // Test case with n = 2
        int[] v3 = {5, 3};
        Ordenacao.ordena(v3, 2);
        assertArrayEquals(new int[]{3, 5}, v3);

        // Test case with n = 3
        int[] v4 = {5, 3, 7};
        Ordenacao.ordena(v4, 3);
        assertArrayEquals(new int[]{3, 5, 7}, v4);

        // Test case with n = 4
        int[] v5 = {5, 3, 7, 1};
        Ordenacao.ordena(v5, 4);
        assertArrayEquals(new int[]{1, 3, 5, 7}, v5);

        // Test case with n = 5
        int[] v6 = {5, 3, 7, 1, 9};
        Ordenacao.ordena(v6, 5);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, v6);
    }
}