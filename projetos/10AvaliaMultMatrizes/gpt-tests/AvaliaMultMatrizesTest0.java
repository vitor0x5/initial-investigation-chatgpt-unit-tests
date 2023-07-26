package ds;import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AvaliaMultMatrizesTest0{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
        // Assert that the object is not null
        assertEquals(true, avaliaMultMatrizes != null);
    }

    @Test(expected = IOException.class, timeout = 1000)
    public void testMultMatrize() throws IOException {
        int n = 3;
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(n, d);
        // No assertions needed as the method does not return a value
    }
}