package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class FPHeapMinTest14{


   @Test(expected = Exception.class, timeout = 1000)
   public void testDefaultConstructor() throws Exception {
      FPHeapMin heap = new FPHeapMin(10);
   }

   @Test(expected = Exception.class, timeout = 1000)
   public void testRefaz() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      heap.refaz(1, 2);
   }

   @Test(expected = Exception.class, timeout = 1000)
   public void testConstroi() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      heap.constroi();
   }

   @Test(timeout = 1000)
   public void testMin() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      Item min = heap.min();
      assertEquals(2, min.recuperaChave());
   }

   @Test(expected = Exception.class, timeout = 1000)
   public void testRetiraMin() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      heap.retiraMin();
   }

   @Test(expected = Exception.class, timeout = 1000)
   public void testDiminuiChave() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      heap.diminuiChave(1, 3);
   }

   @Test(expected = Exception.class, timeout = 1000)
   public void testInsere() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      Item newItem = new MeuItem(3);
      heap.insere(newItem);
   }

   @Test(timeout = 1000)
   public void testImprime() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(items);
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(outContent));
      heap.imprime();
      assertEquals("5 2 7 \n", outContent.toString());
      System.setOut(originalOut);
   }

   @Test(timeout = 1000)
   public void testCopia() throws Exception {
      Item[] items = {new MeuItem(5), new MeuItem(2), new MeuItem(7)};
      FPHeapMin heap = new FPHeapMin(10);
      heap.copia(items);
   }
}