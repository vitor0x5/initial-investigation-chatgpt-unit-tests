package ds;import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class AvaliaMultMatrizesTest1{

    
    @Test(expected = IOException.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
    }
    
    @Test(timeout = 1000)
    public void testMultmatrize() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
    }
}