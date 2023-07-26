package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest6{


  // Test for default constructor
  @Test(timeout = 1000)
  public void testDefaultConstructor() {
    Fila fila = new Fila();
    assertNotNull(fila);
  }

  // Test for enfileira method with valid input
  @Test(timeout = 1000)
  public void testEnfileira() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("test");
    assertEquals("test", fila.item[fila.frente]);
  }

  // Test for enfileira method when the queue is full
  @Test(expected = Exception.class, timeout = 1000)
  public void testEnfileiraFull() throws Exception {
    Fila fila = new Fila();
    for (int i = 0; i < 1000; i++) {
      fila.enfileira(i);
    }
    fila.enfileira(1000);
  }

  // Test for desenfileira method with valid input
  @Test(timeout = 1000)
  public void testDesenfileira() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("test");
    Object item = fila.desenfileira();
    assertEquals("test", item);
    assertTrue(fila.vazia());
  }

  // Test for desenfileira method when the queue is empty
  @Test(expected = Exception.class, timeout = 1000)
  public void testDesenfileiraEmpty() throws Exception {
    Fila fila = new Fila();
    fila.desenfileira();
  }

  // Test for vazia method when the queue is empty
  @Test(timeout = 1000)
  public void testVaziaTrue() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
  }

  // Test for vazia method when the queue is not empty
  @Test(timeout = 1000)
  public void testVaziaFalse() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("test");
    assertFalse(fila.vazia());
  }

  // Test for imprime method
  @Test(timeout = 1000)
  public void testImprime() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("test1");
    fila.enfileira("test2");
    fila.enfileira("test3");
    fila.imprime();
    // assert the output
  }
}