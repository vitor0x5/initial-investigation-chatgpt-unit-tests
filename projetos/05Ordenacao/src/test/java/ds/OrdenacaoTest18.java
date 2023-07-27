package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        int[] v = {5, 3, 8, 2, 1};
        Ordenacao.ordena(v, 5);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdenaEmptyArray() throws Exception {
        int[] v = {};
        Ordenacao.ordena(v, 0);
        int[] expected = {};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdenaSingleElementArray() throws Exception {
        int[] v = {5};
        Ordenacao.ordena(v, 1);
        int[] expected = {5};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdenaAlreadySortedArray() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        Ordenacao.ordena(v, 5);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdenaNegativeValues() throws Exception {
        int[] v = {-5, -3, -8, -2, -1};
        Ordenacao.ordena(v, 5);
        int[] expected = {-8, -5, -3, -2, -1};
        assertArrayEquals(expected, v);
    }

    @Test(timeout=1000)
    public void testOrdenaBoundaryValues() throws Exception {
        int[] v = {-100, 0, 100};
        Ordenacao.ordena(v, 3);
        int[] expected = {-100, 0, 100};
        assertArrayEquals(expected, v);
    }
}