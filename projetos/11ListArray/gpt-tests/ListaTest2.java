package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ListaTest2{

  
  private Lista lista;
  
  @Before
  public void setUp() {
    lista = new Lista();
  }
  
  @Test
  public void testInsere() throws Exception {
    Object x = new Object();
    lista.insere(x);
    assertEquals(x, lista.item[lista.ultimo-1]);
  }
  
  @Test(expected = Exception.class)
  public void testInsereListaCheia() throws Exception {
    for (int i = 0; i < lista.item.length; i++) {
      lista.insere(new Object());
    }
    lista.insere(new Object());
  }
  
  @Test
  public void testVazia() {
    assertTrue(lista.vazia());
  }
  
  @Test
  public void testNaoVazia() throws Exception {
    lista.insere(new Object());
    assertFalse(lista.vazia());
  }
  
  @Test
  public void testImprime() {
    lista.insere("item1");
    lista.insere("item2");
    lista.insere("item3");
    lista.imprime();
  }
}