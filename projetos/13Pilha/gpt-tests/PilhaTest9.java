package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest9{


    // Test case for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    // Test cases for method empilha()
    @Test(timeout=1000)
    public void testEmpilhaWithValidInput() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000, expected=Exception.class)
    public void testEmpilhaWhenPilhaIsFull() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        pilha.empilha(1001);
    }

    // Test cases for method desempilha()
    @Test(timeout=1000, expected=Exception.class)
    public void testDesempilhaWhenPilhaIsEmpty() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    @Test(timeout=1000)
    public void testDesempilhaWithValidInput() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        assertEquals(5, pilha.desempilha());
        assertEquals(0, pilha.tamanho());
    }

    // Test case for method vazia()
    @Test(timeout=1000)
    public void testVaziaWhenPilhaIsEmpty() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaWhenPilhaIsNotEmpty() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        assertFalse(pilha.vazia());
    }

    // Test case for method tamanho()
    @Test(timeout=1000)
    public void testTamanhoWithEmptyPilha() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testTamanhoWithNonEmptyPilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        assertEquals(1, pilha.tamanho());
    }
}