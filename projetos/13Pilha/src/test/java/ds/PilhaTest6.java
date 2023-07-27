package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PilhaTest6{


  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Pilha p = new Pilha();
    assertEquals(0, p.tamanho());
  }

  @Test(timeout=1000)
  public void testEmpilha() throws Exception {
    Pilha p = new Pilha();

    p.empilha(10);
    assertEquals(1, p.tamanho());
    assertFalse(p.vazia());

    p.empilha(-5);
    assertEquals(2, p.tamanho());
    assertFalse(p.vazia());
  }

  @Test(timeout=1000)
  public void testDesempilha() throws Exception {
    Pilha p = new Pilha();
    p.empilha(10);
    p.empilha(-5);

    assertEquals(-5, p.desempilha());
    assertEquals(1, p.tamanho());
    assertFalse(p.vazia());

    assertEquals(10, p.desempilha());
    assertEquals(0, p.tamanho());
    assertTrue(p.vazia());
  }

  @Test(timeout=1000)
  public void testDesempilhaEmptyStack() throws Exception {
    Pilha p = new Pilha();
    try {
      p.desempilha();
      fail("Exception not thrown");
    } catch (Exception e) {
      assertEquals("Erro: A pilha esta vazia", e.getMessage());
    }
  }

  @Test(timeout=1000)
  public void testVazia() throws Exception {
    Pilha p = new Pilha();
    assertTrue(p.vazia());

    p.empilha(10);
    assertFalse(p.vazia());

    p.desempilha();
    assertTrue(p.vazia());
  }

  @Test(timeout=1000)
  public void testTamanho() throws Exception {
    Pilha p = new Pilha();
    assertEquals(0, p.tamanho());

    p.empilha(10);
    assertEquals(1, p.tamanho());

    p.empilha(-5);
    assertEquals(2, p.tamanho());

    p.desempilha();
    assertEquals(1, p.tamanho());

    p.desempilha();
    assertEquals(0, p.tamanho());
  }
}