package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest4{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() {
    Fila fila = new Fila();
    assertNotNull(fila);
  }
  
  @Test(timeout=1000)
  public void testEnfileira() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    fila.enfileira(4);
    fila.enfileira(5);
    
    assertEquals(1, fila.item[0]);
    assertEquals(2, fila.item[1]);
    assertEquals(3, fila.item[2]);
    assertEquals(4, fila.item[3]);
    assertEquals(5, fila.item[4]);
  }
  
  @Test(timeout=1000)
  public void testEnfileiraFull() throws Exception {
    Fila fila = new Fila();
    for (int i = 0; i < 1000; i++) {
      fila.enfileira(i);
    }
    
    try {
      fila.enfileira(1001);
      fail("Should throw an exception");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta cheia", e.getMessage());
    }
  }
  
  @Test(timeout=1000)
  public void testDesenfileira() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    
    assertEquals(1, fila.desenfileira());
    assertEquals(2, fila.desenfileira());
    assertEquals(3, fila.desenfileira());
  }
  
  @Test(timeout=1000)
  public void testDesenfileiraEmpty() throws Exception {
    Fila fila = new Fila();
    
    try {
      fila.desenfileira();
      fail("Should throw an exception");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta vazia", e.getMessage());
    }
  }
  
  @Test(timeout=1000)
  public void testVazia() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
    
    fila.enfileira(1);
    assertFalse(fila.vazia());
    
    fila.desenfileira();
    assertTrue(fila.vazia());
  }
  
  @Test(timeout=1000)
  public void testImprime() {
    Fila fila = new Fila();
    fila.enfileira(1);
    fila.enfileira(2);
    fila.enfileira(3);
    
    // Assuming that the implementation of imprime() is correct,
    // we cannot test its output directly. We can only check if
    // the method runs without errors.
    fila.imprime();
  }
}