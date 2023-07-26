package ds;import ds.CasamentoAproximado;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CasamentoAproximadoTest11{


    // Test case for default constructor
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        CasamentoAproximado obj = new CasamentoAproximado();
    }

    // Test case for shiftAndAproximado method
    @Test(expected = Exception.class, timeout = 1000)
    public void testShiftAndAproximado() throws Exception {
        // Specify the input values
        String T = "This is a test string";
        int n = T.length();
        String P = "test";
        int m = P.length();
        int k = 1;

        // Redirect the standard output to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);

        // Verify the expected output
        String expectedOutput = "Casamento na posicao: 10\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}