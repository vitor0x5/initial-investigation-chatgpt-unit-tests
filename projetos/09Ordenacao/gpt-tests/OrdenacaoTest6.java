package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest6{


	@Test
	public void testDefaultConstructor() throws Exception {
		Ordenacao ordenacao = new Ordenacao();
		assertNotNull(ordenacao);
	}

	@Test(timeout=1000)
	public void testMergeSort() throws Exception {
		// Test with empty array
		int[] emptyArr = {};
		Ordenacao.mergeSort(emptyArr, 0, emptyArr.length - 1);
		assertArrayEquals(new int[]{}, emptyArr);

		// Test with array of length 1
		int[] arr1 = {5};
		Ordenacao.mergeSort(arr1, 0, arr1.length - 1);
		assertArrayEquals(new int[]{5}, arr1);

		// Test with sorted array
		int[] sortedArr = {1, 2, 3, 4, 5};
		Ordenacao.mergeSort(sortedArr, 0, sortedArr.length - 1);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);

		// Test with reverse sorted array
		int[] reverseSortedArr = {5, 4, 3, 2, 1};
		Ordenacao.mergeSort(reverseSortedArr, 0, reverseSortedArr.length - 1);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseSortedArr);

		// Test with random array
		int[] randomArr = {4, 2, 1, 5, 3};
		Ordenacao.mergeSort(randomArr, 0, randomArr.length - 1);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, randomArr);
	}
}