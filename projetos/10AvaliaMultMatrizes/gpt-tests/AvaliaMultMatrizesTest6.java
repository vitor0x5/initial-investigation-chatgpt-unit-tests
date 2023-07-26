package ds;import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class AvaliaMultMatrizesTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AvaliaMultMatrizes avaliaMultMatrizes = new AvaliaMultMatrizes();
        assertNotNull(avaliaMultMatrizes);
    }

    @Test(timeout=1000)
    public void testMultmatrize() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};

        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000)
    public void testMultmatrizeBoundaryValues() throws Exception {
        int n = 2;
        int[] d = {-1, 0};

        AvaliaMultMatrizes.multmatrize(n, d);
    }

    @Test(timeout=1000, expected = IOException.class)
    public void testMultmatrizeIOException() throws Exception {
        int n = 3;
        int[] d = {1, 2, 3};

        AvaliaMultMatrizes.multmatrize(n, d);
        throw new IOException();
    }
}