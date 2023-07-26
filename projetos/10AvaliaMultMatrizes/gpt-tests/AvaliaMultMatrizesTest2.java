package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
        assertNotNull(avaliaMultMatrizes);
    }

    @Test(timeout=1000)
    public void testMultMatrizes() throws Exception {
        int n = 3;
        int[] d = {2, 3, 4};

        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions here to validate the results
    }
}