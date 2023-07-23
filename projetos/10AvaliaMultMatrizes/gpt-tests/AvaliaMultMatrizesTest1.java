package ds;import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest1{


    @Test
    public void testMultmatrize() throws IOException {
        int n = 3;
        int[] d = {1, 2, 3};

        AvaliaMultMatrizes.multmatrize(n, d);
    }
}