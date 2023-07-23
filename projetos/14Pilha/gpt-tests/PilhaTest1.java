package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest1{

    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    // Test empilha method
    @Test
    public void testEmpilha() {
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
        assertFalse(pilha.vazia());
    }

    // Test desempilha method with non-empty stack
    @Test
    public void testDesempilhaNonEmpty() throws Exception {
        pilha.empilha("A");
        pilha.empilha("B");
        Object item = pilha.desempilha();
        assertEquals("B", item);
        assertEquals(1, pilha.tamanho());
        assertFalse(pilha.vazia());
    }

    // Test desempilha method with empty stack
    @Test(expected = Exception.class)
    public void testDesempilhaEmpty() throws Exception {
        pilha.desempilha();
    }

    // Test vazia method with empty stack
    @Test
    public void testVaziaEmpty() {
        assertTrue(pilha.vazia());
    }

    // Test vazia method with non-empty stack
    @Test
    public void testVaziaNonEmpty() {
        pilha.empilha(1);
        assertFalse(pilha.vazia());
    }

    // Test tamanho method with empty stack
    @Test
    public void testTamanhoEmpty() {
        assertEquals(0, pilha.tamanho());
    }

    // Test tamanho method with non-empty stack
    @Test
    public void testTamanhoNonEmpty() {
        pilha.empilha("A");
        pilha.empilha("B");
        assertEquals(2, pilha.tamanho());
    }
}