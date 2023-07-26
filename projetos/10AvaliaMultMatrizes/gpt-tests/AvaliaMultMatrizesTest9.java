package ds;import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class AvaliaMultMatrizesTest9{

    
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes test = new AvaliaMultMatrizes();
        assertNotNull(test);
    }
    
    @Test(timeout = 1000)
    public void testMultmatrize() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};
        
        AvaliaMultMatrizes.multmatrize(n, d);
        
        // Add assertions to verify the correctness of the method
    }
    
    // Add more test cases for each method in the class under testing
}