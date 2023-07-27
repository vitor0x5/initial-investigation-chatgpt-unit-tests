package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest8{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() {
    Fila fila = new Fila();
    assertNotNull(fila);
  }
  
  @Test(timeout=1000)
  public void testVazia() {
    Fila fila = new Fila();
    
    // Verifying if the fila is empty
    assertTrue(fila.vazia());
    
    // Enfileira an item and verifies if the fila is not empty anymore
    fila.enfileira("Item 1");
    assertFalse(fila.vazia());
  }
  
  @Test(timeout=1000)
  public void testImprime() {
    Fila fila = new Fila();
    fila.enfileira("Item 1");
    fila.enfileira("Item 2");
    fila.enfileira("Item 3");
    
    fila.imprime();
    // The method imprime() must print " Item 1 Item 2 Item 3" in the console
  }
}