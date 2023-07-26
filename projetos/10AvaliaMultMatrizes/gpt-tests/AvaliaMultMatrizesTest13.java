package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class AvaliaMultMatrizesTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
        assertNotNull(avaliaMultMatrizes);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws Exception {
        int n = 4;
        int[] d = {1, 2, 3, 4};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}