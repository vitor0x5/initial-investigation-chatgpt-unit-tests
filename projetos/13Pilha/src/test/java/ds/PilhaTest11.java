package ds;import ds.Pilha;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest11{

    
    // Test the default constructor
    @Test(timeout=1000, expected=Exception.class)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.desempilha();
    }
    
    // Test the empilha method with valid inputs
    @Test(timeout=1000)
    public void testEmpilhaValidInputs() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
        pilha.empilha(2);
        assertEquals(2, pilha.tamanho());
    }
    
    // Test the empilha method when the stack is full
    @Test(timeout=1000, expected=Exception.class)
    public void testEmpilhaFullStack() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        pilha.empilha(1001);
    }
    
    // Test the desempilha method with valid inputs
    @Test(timeout=1000)
    public void testDesempilhaValidInputs() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        Object result = pilha.desempilha();
        assertEquals(0, pilha.tamanho());
        assertEquals(1, result);
    }
    
    // Test the desempilha method when the stack is empty
    @Test(timeout=1000, expected=Exception.class)
    public void testDesempilhaEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }
    
    // Test the vazia method when the stack is empty
    @Test(timeout=1000)
    public void testVaziaEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }
    
    // Test the vazia method when the stack is not empty
    @Test(timeout=1000)
    public void testVaziaNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertFalse(pilha.vazia());
    }
    
    // Test the tamanho method when the stack is empty
    @Test(timeout=1000)
    public void testTamanhoEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
    }
    
    // Test the tamanho method when the stack is not empty
    @Test(timeout=1000)
    public void testTamanhoNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
    }
}