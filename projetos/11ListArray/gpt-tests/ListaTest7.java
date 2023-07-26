package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest7{


  @Test(expected = Exception.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testInsere() throws Exception {
    Lista lista = new Lista();

    // Test with valid input
    lista.insere(5);
    assertFalse(lista.vazia());

    // Test with the list full
    for (int i = 0; i < 1000; i++) {
      lista.insere(i);
    }
    lista.insere(1001);
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testVazia() throws Exception {
    Lista lista = new Lista();

    // Test when the list is empty
    assertTrue(lista.vazia());

    // Test when the list is not empty
    lista.insere(10);
    assertFalse(lista.vazia());
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testImprime() throws Exception {
    Lista lista = new Lista();

    // Test when the list is empty
    lista.imprime();

    // Test when the list is not empty
    lista.insere("a");
    lista.insere("b");
    lista.imprime();
  }
}