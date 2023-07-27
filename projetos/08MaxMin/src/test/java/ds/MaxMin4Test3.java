package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test3{


	@Test(timeout=1000)
	public void testDefaultConstructor() {
		try {
			new MaxMin4();
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}

	@Test(timeout=1000)
	public void testMaxMin4() {
		try {
			int v1[] = {1, 2, 3, 4, 5};
			int linf1 = 0;
			int lsup1 = 4;
			int expected1[] = {5, 1};
			assertArrayEquals(expected1, MaxMin4.maxMin4(v1, linf1, lsup1));

			int v2[] = {5, 4, 3, 2, 1};
			int linf2 = 0;
			int lsup2 = 4;
			int expected2[] = {5, 1};
			assertArrayEquals(expected2, MaxMin4.maxMin4(v2, linf2, lsup2));

			int v3[] = {5, 2, 3, 4, 1};
			int linf3 = 0;
			int lsup3 = 4;
			int expected3[] = {5, 1};
			assertArrayEquals(expected3, MaxMin4.maxMin4(v3, linf3, lsup3));

			int v4[] = {1};
			int linf4 = 0;
			int lsup4 = 0;
			int expected4[] = {1, 1};
			assertArrayEquals(expected4, MaxMin4.maxMin4(v4, linf4, lsup4));

			int v5[] = {2, 1};
			int linf5 = 0;
			int lsup5 = 1;
			int expected5[] = {2, 1};
			assertArrayEquals(expected5, MaxMin4.maxMin4(v5, linf5, lsup5));

			int v6[] = {-5, -3, -1, 0, 2, 4, 6};
			int linf6 = 0;
			int lsup6 = 6;
			int expected6[] = {6, -5};
			assertArrayEquals(expected6, MaxMin4.maxMin4(v6, linf6, lsup6));
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
}