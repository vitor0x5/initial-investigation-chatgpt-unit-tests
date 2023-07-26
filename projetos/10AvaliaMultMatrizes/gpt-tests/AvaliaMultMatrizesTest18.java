package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest18{


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
    public void testMultmatrizeWithNegativeValues() throws Exception {
        int n = 3;
        int[] d = {-1, -2, -3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithZeroValues() throws Exception {
        int n = 3;
        int[] d = {0, 0, 0};
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

    @Test(timeout=1000)
    public void testMultmatrizeWithBoundaryValuesNegative() throws Exception {
        int n = Integer.MAX_VALUE;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = -i;
        }
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}