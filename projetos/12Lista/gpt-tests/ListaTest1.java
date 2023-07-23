package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest1{

  
  @Test
  public void testInsere() {
    Lista lista = new Lista();
    lista.insere(5);
    assertFalse(lista.vazia());
  }
  
  @Test
  public void testVazia() {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
  }
  
  @Test
  public void testImprime() {
    Lista lista = new Lista();
    lista.insere(1);
    lista.insere(2);
    lista.insere(3);
    lista.insere(4);
    lista.insere(5);
    lista.imprime();
  }
}