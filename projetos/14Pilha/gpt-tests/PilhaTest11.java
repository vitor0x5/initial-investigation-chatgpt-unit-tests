package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest11{


  @Test(timeout=1000)
  public void testDefaultConstructor() {
    Pilha p = new Pilha();
    assertNotNull(p);
  }
  
  @Test(timeout=1000)
  public void testEmpilha() {
    Pilha p = new Pilha();
    p.empilha(1);
    assertEquals(1, p.tamanho());
    p.empilha(2);
    assertEquals(2, p.tamanho());
  }
  
  @Test(timeout=1000)
  public void testDesempilha() throws Exception {
    Pilha p = new Pilha();
    p.empilha(1);
    p.empilha(2);
    
    assertEquals(2, p.desempilha());
    assertEquals(1, p.tamanho());
    assertEquals(1, p.desempilha());
    assertEquals(0, p.tamanho());
    
    try {
      p.desempilha();
      fail("Expected Exception not thrown");
    } catch (Exception e) {
      assertEquals("Erro: A pilha esta vazia", e.getMessage());
    }
  }
  
  @Test(timeout=1000)
  public void testVazia() {
    Pilha p = new Pilha();
    assertTrue(p.vazia());
    p.empilha(1);
    assertFalse(p.vazia());
  }
}