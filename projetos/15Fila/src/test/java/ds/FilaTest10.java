package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest10{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Fila fila = new Fila();
    assertNotNull(fila);
  }

  @Test(timeout=1000)
  public void testEnfileira() throws Exception {
    Fila fila = new Fila();
    Object obj = new Object();
    fila.enfileira(obj);
    assertEquals(obj, fila.item[fila.tras-1]);
  }

  @Test(timeout=1000)
  public void testDesenfileira() throws Exception {
    Fila fila = new Fila();
    Object obj1 = new Object();
    Object obj2 = new Object();
    fila.enfileira(obj1);
    fila.enfileira(obj2);
    Object desenfileirado = fila.desenfileira();
    assertEquals(obj1, desenfileirado);
  }

  @Test(timeout=1000)
  public void testVazia() throws Exception {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
  }

  @Test(timeout=1000)
  public void testImprime() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("A");
    fila.enfileira("B");
    fila.enfileira("C");
    fila.imprime();
  }
}