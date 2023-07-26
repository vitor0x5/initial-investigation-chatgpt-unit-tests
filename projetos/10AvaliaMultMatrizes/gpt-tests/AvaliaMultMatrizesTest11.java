package ds;import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;

public class AvaliaMultMatrizesTest11{


    @Test(expected = IOException.class, timeout = 1000)
    public void testMultMatrize() throws Exception {
        int[] d = {1, 2, 3};
        AvaliaMultMatrizes.multmatrize(3, d);
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes obj = new AvaliaMultMatrizes();
        assertNotNull(obj);
    }

    @Test(timeout = 1000)
    public void testMultMatrizeDecision1() throws Exception {
        int[] d = {1};
        AvaliaMultMatrizes.multmatrize(1, d);
    }

    @Test(timeout = 1000)
    public void testMultMatrizeDecision2() throws Exception {
        int[] d = {1, 2};
        AvaliaMultMatrizes.multmatrize(2, d);
    }

    @Test(timeout = 1000)
    public void testMultMatrizeDecision3() throws Exception {
        int[] d = {1, -2};
        AvaliaMultMatrizes.multmatrize(2, d);
    }

    @Test(timeout = 1000)
    public void testMultMatrizeDecision4() throws Exception {
        int[] d = {-1, 2};
        AvaliaMultMatrizes.multmatrize(2, d);
    }
}