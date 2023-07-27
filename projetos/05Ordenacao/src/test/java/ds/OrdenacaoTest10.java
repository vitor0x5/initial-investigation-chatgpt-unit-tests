package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest10{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test case 1: n = 0, empty array
        int[] v1 = {};
        Ordenacao.ordena(v1, 0);
        assertArrayEquals(new int[]{}, v1);

        // Test case 2: n = 1, array with one element
        int[] v2 = {1};
        Ordenacao.ordena(v2, 1);
        assertArrayEquals(new int[]{1}, v2);

        // Test case 3: n = 5, positive values
        int[] v3 = {5, 2, 9, 1, 7};
        Ordenacao.ordena(v3, 5);
        assertArrayEquals(new int[]{1, 2, 5, 7, 9}, v3);

        // Test case 4: n = 5, positive and negative values
        int[] v4 = {5, -2, 9, -1, 7};
        Ordenacao.ordena(v4, 5);
        assertArrayEquals(new int[]{-2, -1, 5, 7, 9}, v4);

        // Test case 5: n = 5, zero values
        int[] v5 = {0, 0, 0, 0, 0};
        Ordenacao.ordena(v5, 5);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, v5);
    }
}