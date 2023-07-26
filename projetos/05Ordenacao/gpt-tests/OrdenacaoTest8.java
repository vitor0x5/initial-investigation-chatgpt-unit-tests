package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest8{


	@Test(timeout=1000)
	public void testDefaultConstructor() throws Exception {
		Ordenacao ordenacao = new Ordenacao();
		assertNotNull(ordenacao);
	}
	
	@Test(timeout=1000)
	public void testOrdena() throws Exception {
		// Test case with no elements in the array
		int[] v1 = {};
		Ordenacao.ordena(v1, 0);
		assertArrayEquals(new int[]{}, v1);
		
		// Test case with one element in the array
		int[] v2 = {5};
		Ordenacao.ordena(v2, 1);
		assertArrayEquals(new int[]{5}, v2);
		
		// Test case with two elements in the array, already sorted
		int[] v3 = {3, 7};
		Ordenacao.ordena(v3, 2);
		assertArrayEquals(new int[]{3, 7}, v3);
		
		// Test case with two elements in the array, not sorted
		int[] v4 = {7, 3};
		Ordenacao.ordena(v4, 2);
		assertArrayEquals(new int[]{3, 7}, v4);
		
		// Test case with three elements in the array, already sorted
		int[] v5 = {1, 2, 3};
		Ordenacao.ordena(v5, 3);
		assertArrayEquals(new int[]{1, 2, 3}, v5);
		
		// Test case with three elements in the array, not sorted
		int[] v6 = {3, 1, 2};
		Ordenacao.ordena(v6, 3);
		assertArrayEquals(new int[]{1, 2, 3}, v6);
		
		// Test case with four elements in the array, already sorted
		int[] v7 = {1, 2, 3, 4};
		Ordenacao.ordena(v7, 4);
		assertArrayEquals(new int[]{1, 2, 3, 4}, v7);
		
		// Test case with four elements in the array, not sorted
		int[] v8 = {4, 2, 3, 1};
		Ordenacao.ordena(v8, 4);
		assertArrayEquals(new int[]{1, 2, 3, 4}, v8);
		
		// Test case with five elements in the array, already sorted
		int[] v9 = {-5, -2, 0, 1, 5};
		Ordenacao.ordena(v9, 5);
		assertArrayEquals(new int[]{-5, -2, 0, 1, 5}, v9);
		
		// Test case with five elements in the array, not sorted
		int[] v10 = {5, 0, -5, -2, 1};
		Ordenacao.ordena(v10, 5);
		assertArrayEquals(new int[]{-5, -2, 0, 1, 5}, v10);
	}

}