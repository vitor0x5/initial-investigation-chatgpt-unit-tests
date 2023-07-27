package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest5{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    // Test for empilha method
    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();

        // Test empilha with valid input
        pilha.empilha(10);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());

        // Test empilha with valid input
        pilha.empilha(20);
        assertFalse(pilha.vazia());
        assertEquals(2, pilha.tamanho());
    }

    // Test for desempilha method
    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();

        // Test desempilha when pilha is empty
        try {
            pilha.desempilha();
            fail("Expected Exception was not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
        }

        // Test desempilha with valid input
        pilha.empilha(10);
        pilha.empilha(20);
        assertEquals(20, pilha.desempilha());
        assertEquals(1, pilha.tamanho());
    }

    // Test for vazia method
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();

        // Test vazia when pilha is empty
        assertTrue(pilha.vazia());

        // Test vazia when pilha is not empty
        pilha.empilha(10);
        assertFalse(pilha.vazia());
    }

    // Test for tamanho method
    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();

        // Test tamanho when pilha is empty
        assertEquals(0, pilha.tamanho());

        // Test tamanho when pilha is not empty
        pilha.empilha(10);
        pilha.empilha(20);
        assertEquals(2, pilha.tamanho());
    }
}