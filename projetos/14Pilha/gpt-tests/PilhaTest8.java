package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest8{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testDesempilhaWithNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        pilha.empilha(20);
        Object item = pilha.desempilha();
        assertEquals(20, item);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesempilhaWithEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    @Test(timeout = 1000)
    public void testVaziaWithEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }

    @Test(timeout = 1000)
    public void testVaziaWithNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertFalse(pilha.vazia());
    }

    @Test(timeout = 1000)
    public void testTamanhoWithEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testTamanhoWithNonEmptyStack() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        pilha.empilha(20);
        assertEquals(2, pilha.tamanho());
    }
}