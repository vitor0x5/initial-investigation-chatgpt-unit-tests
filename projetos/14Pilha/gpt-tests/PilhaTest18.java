package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest18{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        Object item = pilha.desempilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
        assertEquals(1, item);
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(1);
        assertFalse(pilha.vazia());
    }

    @Test(timeout = 1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
        pilha.empilha(2);
        assertEquals(2, pilha.tamanho());
        pilha.desempilha();
        assertEquals(1, pilha.tamanho());
    }
}