package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        AvaliaMultMatrizes obj = new AvaliaMultMatrizes();
        assertNotNull(obj);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws IOException {
        int n = 4;
        int[] d = {1, 2, 3, 4};
        AvaliaMultMatrizes.multmatrize(n, d);
        // Add assertions for the expected output
    }
}