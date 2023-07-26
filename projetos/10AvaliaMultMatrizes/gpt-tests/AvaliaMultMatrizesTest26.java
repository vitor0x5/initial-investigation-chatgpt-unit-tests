package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest26{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
        assertNotNull(avaliaMultMatrizes);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithZeroN() throws Exception {
        int n = 0;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNegativeN() throws Exception {
        int n = -3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNullD() throws Exception {
        int n = 3;
        int[] d = null;
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithEmptyD() throws Exception {
        int n = 3;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithPositiveValues() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNegativeValues() throws Exception {
        int n = 3;
        int[] d = {-1, -2, -3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithBoundaryValues() throws Exception {
        int n = Integer.MAX_VALUE;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i;
        }
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}