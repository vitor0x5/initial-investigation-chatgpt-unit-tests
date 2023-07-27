package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest14{

    
    @Test( timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
    
    @Test(timeout = 1000)
    public void testOrdena() throws Exception {
        // Test case with empty array
        int[] emptyArray = {};
        Ordenacao.ordena(emptyArray, 0);
        assertArrayEquals(new int[]{}, emptyArray);
        
        // Test case with array of size 1
        int[] arraySize1 = {5};
        Ordenacao.ordena(arraySize1, 1);
        assertArrayEquals(new int[]{5}, arraySize1);
        
        // Test case with array of size 2
        int[] arraySize2 = {2, 1};
        Ordenacao.ordena(arraySize2, 2);
        assertArrayEquals(new int[]{1, 2}, arraySize2);
        
        // Test case with array of size 3
        int[] arraySize3 = {-4, 3, -2};
        Ordenacao.ordena(arraySize3, 3);
        assertArrayEquals(new int[]{-4, -2, 3}, arraySize3);
        
        // Test case with array of size 5
        int[] arraySize5 = {10, -5, 0, 7, -3};
        Ordenacao.ordena(arraySize5, 5);
        assertArrayEquals(new int[]{-5, -3, 0, 7, 10}, arraySize5);
    }
}