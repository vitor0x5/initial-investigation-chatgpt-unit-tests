package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class AvaliaMultMatrizesTest3{


   @Test(timeout=1000)
   public void testDefaultConstructor() throws Exception {
      AvaliaMultMatrizes multMatrizes = new AvaliaMultMatrizes();
      assertNotNull(multMatrizes);
   }

   @Test(timeout=1000)
   public void testMultmatrize() throws Exception {
      int n = 3;
      int[] d = {1, 2, 3};
      AvaliaMultMatrizes.multmatrize(n, d);
   }
}