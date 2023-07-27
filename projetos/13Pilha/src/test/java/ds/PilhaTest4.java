package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest4{


  //Test for default constructor
  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Pilha pilha = new Pilha();
    assertNotNull(pilha);
  }
  
  //Test for empilha method with valid input
  @Test(timeout=1000)
  public void testEmpilhaValidInput() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(5);
    assertEquals(1, pilha.tamanho());
  }
  
  //Test for empilha method when the stack is full
  @Test(timeout=1000, expected=Exception.class)
  public void testEmpilhaStackFull() throws Exception {
    Pilha pilha = new Pilha();
    for (int i = 0; i < 1000; i++) {
      pilha.empilha(i);
    }
    pilha.empilha(1001);
  }
  
  //Test for desempilha method with valid input
  @Test(timeout=1000)
  public void testDesempilhaValidInput() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(5);
    Object result = pilha.desempilha();
    assertEquals(5, result);
    assertTrue(pilha.vazia());
  }
  
  //Test for desempilha method when the stack is empty
  @Test(timeout=1000, expected=Exception.class)
  public void testDesempilhaStackEmpty() throws Exception {
    Pilha pilha = new Pilha();
    pilha.desempilha();
  }
  
  //Test for vazia method when the stack is empty
  @Test(timeout=1000)
  public void testVaziaStackEmpty() throws Exception {
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
  }
  
  //Test for vazia method when the stack is not empty
  @Test(timeout=1000)
  public void testVaziaStackNotEmpty() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(5);
    assertFalse(pilha.vazia());
  }
  
  //Test for tamanho method with empty stack
  @Test(timeout=1000)
  public void testTamanhoEmptyStack() throws Exception {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
  }
  
  //Test for tamanho method with non-empty stack
  @Test(timeout=1000)
  public void testTamanhoNonEmptyStack() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(5);
    pilha.empilha(10);
    assertEquals(2, pilha.tamanho());
  }
}