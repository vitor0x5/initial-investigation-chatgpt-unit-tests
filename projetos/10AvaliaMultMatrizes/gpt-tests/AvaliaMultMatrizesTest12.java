package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest12{


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
    public void testMultmatrizeWithBoundaryValues() throws Exception {
        int n = 1;
        int[] d = {0};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}