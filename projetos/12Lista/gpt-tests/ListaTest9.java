package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest9{


  @Test(expected = Exception.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    Lista lista = new Lista();
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testInsere() throws Exception {
    Lista lista = new Lista();
    lista.insere("Hello");
    assertFalse(lista.vazia());
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testVazia() throws Exception {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testImprime() throws Exception {
    Lista lista = new Lista();
    lista.insere(1);
    lista.insere(2);
    lista.insere(3);
    lista.imprime();
  }
}