package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest5{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertNotNull(p);
    }

    // Test for empilha method with valid input
    @Test(timeout=1000)
    public void testEmpilhaValidInput() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertEquals(1, p.tamanho());
    }

    // Test for empilha method with full stack
    @Test(timeout=1000, expected=Exception.class)
    public void testEmpilhaFullStack() throws Exception {
        Pilha p = new Pilha();
        for (int i = 0; i < 1000; i++) {
            p.empilha(i);
        }
        p.empilha(1001); // should throw Exception
    }

    // Test for desempilha method with valid input
    @Test(timeout=1000)
    public void testDesempilhaValidInput() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        Object result = p.desempilha();
        assertEquals(0, p.tamanho());
        assertEquals(5, result);
    }

    // Test for desempilha method with empty stack
    @Test(timeout=1000, expected=Exception.class)
    public void testDesempilhaEmptyStack() throws Exception {
        Pilha p = new Pilha();
        p.desempilha(); // should throw Exception
    }

    // Test for vazia method when stack is empty
    @Test(timeout=1000)
    public void testVaziaEmptyStack() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
    }

    // Test for vazia method when stack is not empty
    @Test(timeout=1000)
    public void testVaziaNonEmptyStack() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertFalse(p.vazia());
    }

    // Test for tamanho method with empty stack
    @Test(timeout=1000)
    public void testTamanhoEmptyStack() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
    }

    // Test for tamanho method with non-empty stack
    @Test(timeout=1000)
    public void testTamanhoNonEmptyStack() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertEquals(1, p.tamanho());
    }
}