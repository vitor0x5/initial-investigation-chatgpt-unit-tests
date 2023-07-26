package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
        assertNotNull(avaliaMultMatrizes);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws IOException {
        int n = 3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithZeroN() throws IOException {
        int n = 0;
        int[] d = {};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNegativeN() throws IOException {
        int n = -3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithNegativeD() throws IOException {
        int n = 3;
        int[] d = {-1, -2, -3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithZeroD() throws IOException {
        int n = 3;
        int[] d = {0, 0, 0};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithPositiveAndNegativeD() throws IOException {
        int n = 3;
        int[] d = {-1, 0, 1};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithMaxIntD() throws IOException {
        int n = 3;
        int[] d = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeWithMinIntD() throws IOException {
        int n = 3;
        int[] d = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}