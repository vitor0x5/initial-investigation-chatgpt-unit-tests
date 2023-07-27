package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest13{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
        assertEquals(0, pilha.tamanho());
        assertTrue(pilha.vazia());
    }

    // Test for the empilha method
    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();

        // Test with valid input
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
        assertFalse(pilha.vazia());

        // Test with valid input
        pilha.empilha(-5);
        assertEquals(2, pilha.tamanho());
        assertFalse(pilha.vazia());

        // Test when the stack is full
        try {
            for (int i = 0; i < 1000; i++) {
                pilha.empilha(i);
            }
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
        }
    }

    // Test for the desempilha method
    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();

        // Test when the stack is empty
        try {
            pilha.desempilha();
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
        }

        // Test with valid input
        pilha.empilha(10);
        pilha.empilha(-5);
        assertEquals(-5, pilha.desempilha());
        assertEquals(1, pilha.tamanho());
        assertFalse(pilha.vazia());
    }

    // Test for the vazia method
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());

        pilha.empilha(10);
        assertFalse(pilha.vazia());

        pilha.desempilha();
        assertTrue(pilha.vazia());
    }

    // Test for the tamanho method
    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());

        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());

        pilha.empilha(-5);
        assertEquals(2, pilha.tamanho());

        pilha.desempilha();
        assertEquals(1, pilha.tamanho());
    }
}