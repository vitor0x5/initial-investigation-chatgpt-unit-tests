package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

public class PilhaTest9{


  private Pilha pilha;

  @Before
  public void setUp() throws Exception {
    pilha = new Pilha();
  }

  @Test(timeout=1000)
  public void testConstructor() {
    assertNotNull(pilha);
  }

  @Test(timeout=1000)
  public void testEmpilha() {
    pilha.empilha(1);
    assertFalse(pilha.vazia());
    assertEquals(1, pilha.tamanho());
  }

  @Test(timeout=1000)
  public void testDesempilha() throws Exception {
    pilha.empilha(1);
    pilha.empilha(2);
    pilha.empilha(3);
    assertEquals(3, pilha.desempilha());
    assertEquals(2, pilha.tamanho());
  }

  @Test(expected=Exception.class, timeout=1000)
  public void testDesempilhaEmptyStack() throws Exception {
    pilha.desempilha();
  }

  @Test(timeout=1000)
  public void testVazia() {
    assertTrue(pilha.vazia());
    pilha.empilha(1);
    assertFalse(pilha.vazia());
  }

  @Test(timeout=1000)
  public void testTamanho() {
    assertEquals(0, pilha.tamanho());
    pilha.empilha(1);
    assertEquals(1, pilha.tamanho());
  }
}