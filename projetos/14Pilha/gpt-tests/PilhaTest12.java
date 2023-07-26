package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest12{


  @Test(expected = Exception.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
    assertTrue(pilha.vazia());
    pilha.desempilha(); // Throws exception
  }

  @Test(timeout = 1000)
  public void testEmpilha() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(1);
    assertEquals(1, pilha.tamanho());
    assertFalse(pilha.vazia());
  }

  @Test(expected = Exception.class, timeout = 1000)
  public void testDesempilhaEmpty() throws Exception {
    Pilha pilha = new Pilha();
    pilha.desempilha(); // Throws exception
  }

  @Test(timeout = 1000)
  public void testDesempilha() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(1);
    pilha.empilha(2);
    assertEquals(2, pilha.desempilha());
    assertEquals(1, pilha.tamanho());
  }

  @Test(timeout = 1000)
  public void testVazia() throws Exception {
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
    pilha.empilha(1);
    assertFalse(pilha.vazia());
  }

  @Test(timeout = 1000)
  public void testTamanho() throws Exception {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
    pilha.empilha(1);
    assertEquals(1, pilha.tamanho());
  }
}