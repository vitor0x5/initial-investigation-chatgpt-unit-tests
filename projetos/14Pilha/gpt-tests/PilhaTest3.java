package ds;import ds.Pilha;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest3{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    // Test for empilha method with valid input
    @Test(timeout=1000)
    public void testEmpilhaValidInput() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
    }

    // Test for desempilha method when the stack is empty
    @Test(expected=Exception.class, timeout=1000)
    public void testDesempilhaEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    // Test for desempilha method when the stack is not empty
    @Test(timeout=1000)
    public void testDesempilhaNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        Object item = pilha.desempilha();
        assertNotNull(item);
        assertEquals(0, pilha.tamanho());
    }

    // Test for vazia method when the stack is empty
    @Test(timeout=1000)
    public void testVaziaEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        boolean isEmpty = pilha.vazia();
        assertTrue(isEmpty);
    }

    // Test for vazia method when the stack is not empty
    @Test(timeout=1000)
    public void testVaziaNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        boolean isEmpty = pilha.vazia();
        assertFalse(isEmpty);
    }

    // Test for tamanho method with positive value
    @Test(timeout=1000)
    public void testTamanhoPositiveValue() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        int size = pilha.tamanho();
        assertEquals(1, size);
    }

    // Test for tamanho method with negative value
    @Test(timeout=1000)
    public void testTamanhoNegativeValue() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        pilha.desempilha();
        int size = pilha.tamanho();
        assertEquals(0, size);
    }

    // Test for tamanho method with boundary value
    @Test(timeout=1000)
    public void testTamanhoBoundaryValue() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        int size = pilha.tamanho();
        assertEquals(1000, size);
    }
}