package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest19{


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
    public void testMultmatrize_MaxValue() throws Exception {
        int n = Integer.MAX_VALUE;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i+1;
        }
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrize_MinValue() throws Exception {
        int n = Integer.MIN_VALUE;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i+1;
        }
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrize_Zero() throws Exception {
        int n = 0;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}