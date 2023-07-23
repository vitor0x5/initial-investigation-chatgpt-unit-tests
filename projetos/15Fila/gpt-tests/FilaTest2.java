package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FilaTest2{


  private Fila fila;

  @Before
  public void setUp() {
    fila = new Fila();
  }

  @Test
  public void testEnfileira() throws Exception {
    fila.enfileira("Item 1");
    fila.enfileira("Item 2");
    fila.enfileira("Item 3");
    assertEquals("Item 1", fila.desenfileira());
    assertEquals("Item 2", fila.desenfileira());
    assertEquals("Item 3", fila.desenfileira());
  }

  @Test(expected = Exception.class)
  public void testEnfileiraWhenFull() throws Exception {
    for (int i = 0; i < 1000; i++) {
      fila.enfileira("Item " + (i + 1));
    }
    fila.enfileira("Item 1001");
  }

  @Test
  public void testDesenfileira() throws Exception {
    fila.enfileira("Item 1");
    fila.enfileira("Item 2");
    fila.enfileira("Item 3");
    assertEquals("Item 1", fila.desenfileira());
    assertEquals("Item 2", fila.desenfileira());
    assertEquals("Item 3", fila.desenfileira());
  }

  @Test(expected = Exception.class)
  public void testDesenfileiraWhenEmpty() throws Exception {
    fila.desenfileira();
  }

  @Test
  public void testVazia() throws Exception {
    assertTrue(fila.vazia());
    fila.enfileira("Item");
    assertFalse(fila.vazia());
  }

  @Test
  public void testImprime() throws Exception {
    fila.enfileira("Item 1");
    fila.enfileira("Item 2");
    fila.enfileira("Item 3");
    fila.imprime();
  }
}