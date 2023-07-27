package ds;import org.junit.Test;

public class CasamentoAproximadoTest10{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        try {
            CasamentoAproximado casamentoAproximado = new CasamentoAproximado();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
    @Test(timeout = 1000)
    public void testShiftAndAproximado() {
        try {
            String T = "Hello World";
            int n = T.length();
            String P = "o";
            int m = P.length();
            int k = 1;
            CasamentoAproximado.shiftAndAproximado(T, n, P, m, k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}