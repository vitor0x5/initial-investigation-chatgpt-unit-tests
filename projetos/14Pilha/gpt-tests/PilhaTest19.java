package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest19{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    @Test(timeout=1000)
    public void testEmpilha() {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        Object item = pilha.desempilha();
        assertEquals(0, pilha.tamanho());
        assertEquals(10, item);
    }

    @Test(timeout=1000)
    public void testVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(10);
        assertFalse(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
    }
}