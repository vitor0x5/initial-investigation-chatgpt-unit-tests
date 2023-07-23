package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest1{


    @Test
    public void testOrdena() {
        int[] v = {5, 2, 7, 3, 1};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(new int[] {1, 2, 3, 5, 7}, v);
    }

    @Test
    public void testOrdenaEmptyArray() {
        int[] v = {};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(new int[] {}, v);
    }

    @Test
    public void testOrdenaSingleElementArray() {
        int[] v = {9};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(new int[] {9}, v);
    }

    @Test
    public void testOrdenaAlreadySortedArray() {
        int[] v = {1, 3, 5, 7, 9};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(new int[] {1, 3, 5, 7, 9}, v);
    }

    @Test
    public void testOrdenaDescendingArray() {
        int[] v = {9, 7, 5, 3, 1};
        Ordenacao.ordena(v, v.length);
        assertArrayEquals(new int[] {1, 3, 5, 7, 9}, v);
    }
}