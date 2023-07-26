package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class CasamentoAproximadoTest4{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
    assertNotNull(casamentoAproximado);
  }

  @Test(timeout=1000)
  public void testShiftAndAproximado() throws Exception {
    // Test case with positive values
    String T = "abcdabcdabcd";
    int n = T.length();
    String P = "bcd";
    int m = P.length();
    int k = 2;
    CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
    
    // Test case with negative values
    T = "xyzxyzxyzxyz";
    n = T.length();
    P = "xyz";
    m = P.length();
    k = 3;
    CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
  }
}