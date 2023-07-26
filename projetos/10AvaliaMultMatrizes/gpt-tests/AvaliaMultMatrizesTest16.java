package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes amm = new AvaliaMultMatrizes();
        assertNotNull(amm);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws Exception {
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(3, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithZeroN() throws Exception {
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(0, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNegativeN() throws Exception {
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(-3, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNullD() throws Exception {
        AvaliaMultMatrizes.multmatrize(3, null);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithEmptyD() throws Exception {
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(3, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithPositiveValues() throws Exception {
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(3, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNegativeValues() throws Exception {
        int[] d = {-1, -2, -3};
        AvaliaMultMatrizes.multmatrize(3, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithBoundaryValues() throws Exception {
        int[] d = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        AvaliaMultMatrizes.multmatrize(3, d);
    }
}