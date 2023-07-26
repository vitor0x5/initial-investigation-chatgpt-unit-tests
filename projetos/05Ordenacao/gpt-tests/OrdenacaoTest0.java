package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest0{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout = 1000)
    public void testOrdena() throws Exception {
        // Test case with n = 0
        int[] v1 = {};
        Ordenacao.ordena(v1, 0);

        // Test case with n = 1
        int[] v2 = {5};
        Ordenacao.ordena(v2, 1);

        // Test case with n = 2
        int[] v3 = {5, 3};
        Ordenacao.ordena(v3, 2);

        // Test case with n = 3
        int[] v4 = {5, 3, 8};
        Ordenacao.ordena(v4, 3);

        // Test case with n = 4
        int[] v5 = {5, 3, 8, 2};
        Ordenacao.ordena(v5, 4);

        // Test case with n = 5
        int[] v6 = {5, 3, 8, 2, 9};
        Ordenacao.ordena(v6, 5);
    }
}