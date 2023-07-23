package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest0{

  
  private Pilha pilha;
  
  @Before
  public void setUp() {
    pilha = new Pilha();
  }
  
  @Test
  public void testEmpilha() throws Exception {
    pilha.empilha("Item 1");
    pilha.empilha("Item 2");
    pilha.empilha("Item 3");
    assertEquals(3, pilha.tamanho());
  }
  
  @Test(expected = Exception.class)
  public void testEmpilhaPilhaCheia() throws Exception {
    for (int i = 0; i < 1000; i++) {
      pilha.empilha("Item");
    }
    pilha.empilha("Item Extra");
  }
  
  @Test
  public void testDesempilha() throws Exception {
    pilha.empilha("Item 1");
    pilha.empilha("Item 2");
    pilha.empilha("Item 3");
    assertEquals("Item 3", pilha.desempilha());
    assertEquals("Item 2", pilha.desempilha());
    assertEquals("Item 1", pilha.desempilha());
    assertTrue(pilha.vazia());
  }
  
  @Test(expected = Exception.class)
  public void testDesempilhaPilhaVazia() throws Exception {
    pilha.desempilha();
  }
  
  @Test
  public void testVazia() throws Exception {
    assertTrue(pilha.vazia());
    pilha.empilha("Item");
    assertFalse(pilha.vazia());
  }
  
  @Test
  public void testTamanho() throws Exception {
    assertEquals(0, pilha.tamanho());
    pilha.empilha("Item 1");
    assertEquals(1, pilha.tamanho());
    pilha.empilha("Item 2");
    assertEquals(2, pilha.tamanho());
    pilha.desempilha();
    assertEquals(1, pilha.tamanho());
  }
}