package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest1{


   @Test(timeout=1000)
   public void testDefaultConstructor() throws Exception {
      Ordenacao ord = new Ordenacao();
   }

   @Test(timeout=1000)
   public void testMergeSort() throws Exception {
      int[] v = {3, 1, 4, 2};
      Ordenacao.mergeSort(v, 0, 3);
      assertArrayEquals(new int[] {1, 2, 3, 4}, v);
   }
}