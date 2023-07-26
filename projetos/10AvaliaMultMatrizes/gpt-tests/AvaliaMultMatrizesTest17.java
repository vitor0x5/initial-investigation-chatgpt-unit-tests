package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest17{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes obj = new AvaliaMultMatrizes();
        assertNotNull(obj);
    }
    
    @Test(timeout=1000)
    public void testMultmatrize() throws Exception {
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(3, d);
        // Add assertions for the expected output
    }
    
    // Add tests for other methods in the class under test
    
}