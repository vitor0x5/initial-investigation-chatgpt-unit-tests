package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest9{

  
  // Default Constructor Test
  @Test(timeout=1000, expected=Exception.class)
  public void testDefaultConstructor() throws Exception {
    Fila fila = new Fila();
  }
  
  // enfileira() Tests
  @Test(timeout=1000)
  public void testEnfileiraWithValidInput() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(5);
    fila.enfileira(-10);
  }
  
  @Test(timeout=1000, expected=Exception.class)
  public void testEnfileiraWithFullFila() throws Exception {
    Fila fila = new Fila();
    for (int i = 0; i < 1000; i++) {
      fila.enfileira(i);
    }
    fila.enfileira(1001);
  }
  
  // desenfileira() Tests
  @Test(timeout=1000)
  public void testDesenfileiraWithValidInput() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(5);
    fila.enfileira(-10);
    Object item = fila.desenfileira();
    assertEquals(5, item);
  }
  
  @Test(timeout=1000, expected=Exception.class)
  public void testDesenfileiraWithEmptyFila() throws Exception {
    Fila fila = new Fila();
    fila.desenfileira();
  }
  
  // vazia() Tests
  @Test(timeout=1000)
  public void testVaziaWithEmptyFila() throws Exception {
    Fila fila = new Fila();
    boolean result = fila.vazia();
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testVaziaWithNonEmptyFila() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(5);
    boolean result = fila.vazia();
    assertFalse(result);
  }
  
  // imprime() Test
  @Test(timeout=1000)
  public void testImprimeWithNonEmptyFila() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(5);
    fila.enfileira(-10);
    fila.imprime();
  }
}