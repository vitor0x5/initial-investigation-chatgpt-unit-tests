package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest15{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes obj = new AvaliaMultMatrizes();
        assertNotNull(obj);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeBoundaryValues() throws Exception {
        int n = 1;
        int[] d = {1};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeNegativeValues() throws Exception {
        int n = 3;
        int[] d = {-1, -2, -3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}