package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest4{


	@Test(timeout=1000)
	public void testDefaultConstructor() throws Exception {
		AvaliaMultMatrizes amm = new AvaliaMultMatrizes();
		assertNotNull(amm);
	}

	@Test(timeout=1000)
	public void testMultmatrize() throws Exception {
		int[] d = {1, 2, 3, 4};
		AvaliaMultMatrizes.multmatrize(4, d);
	}
	
	@Test(timeout=1000)
	public void testMultmatrize_WithZeroN() throws Exception {
		int[] d = {1, 2, 3, 4};
		AvaliaMultMatrizes.multmatrize(0, d);
	}
	
	@Test(timeout=1000)
	public void testMultmatrize_WithNegativeN() throws Exception {
		int[] d = {1, 2, 3, 4};
		AvaliaMultMatrizes.multmatrize(-4, d);
	}
	
	@Test(timeout=1000)
	public void testMultmatrize_WithNullD() throws Exception {
		AvaliaMultMatrizes.multmatrize(4, null);
	}

	@Test(timeout=1000, expected = IOException.class)
	public void testMultmatrize_IOException() throws Exception {
		int[] d = {1, 2, 3, 4};
		throw new IOException();
	}
}