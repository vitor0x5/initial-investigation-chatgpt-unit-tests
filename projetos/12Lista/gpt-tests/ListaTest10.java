package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest10{

  
  @Test
  public void testDefaultConstructor() throws Exception {
    Lista lista = new Lista();
    assertFalse(lista.vazia());
  }
  
  @Test(timeout=1000)
  public void testInsere() throws Exception {
    Lista lista = new Lista();
    Object obj = new Object();
    
    lista.insere(obj);
    assertFalse(lista.vazia());
    
    lista.insere(null);
    assertFalse(lista.vazia());
  }
  
  @Test(timeout=1000)
  public void testVazia() throws Exception {
    Lista lista = new Lista();
    
    assertTrue(lista.vazia());
    
    lista.insere(new Object());
    assertFalse(lista.vazia());
  }
  
  @Test(timeout=1000)
  public void testImprime() throws Exception {
    Lista lista = new Lista();
    Object obj1 = new Object();
    Object obj2 = new Object();
    
    lista.insere(obj1);
    lista.imprime();
    
    lista.insere(obj2);
    lista.imprime();
  }
}