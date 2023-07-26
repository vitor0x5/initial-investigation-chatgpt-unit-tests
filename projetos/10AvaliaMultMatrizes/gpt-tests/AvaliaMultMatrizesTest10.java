package ds;import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class AvaliaMultMatrizesTest10{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    AvaliaMultMatrizes avalia = new AvaliaMultMatrizes();
    assertNotNull(avalia);
  }

  @Test(expected=IOException.class, timeout=1000)
  public void testMultMatrizes() throws Exception {
    int n = 3;
    int[] d = {1, 2, 3};
    AvaliaMultMatrizes.multmatrize(n, d);
  }
}