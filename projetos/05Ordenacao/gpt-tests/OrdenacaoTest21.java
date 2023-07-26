package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest21{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        // Test with empty array
        int[] v1 = {};
        Ordenacao.ordena(v1, 0);

        // Test with array of size 1
        int[] v2 = {5};
        Ordenacao.ordena(v2, 1);

        // Test with array of size 2
        int[] v3 = {3, 1};
        Ordenacao.ordena(v3, 2);

        // Test with array of size 3
        int[] v4 = {7, -2, 4};
        Ordenacao.ordena(v4, 3);

        // Test with array of size 4
        int[] v5 = {0, -5, 2, 9};
        Ordenacao.ordena(v5, 4);

        // Test with array of size 5
        int[] v6 = {6, -3, 1, 8, -4};
        Ordenacao.ordena(v6, 5);
    }
}