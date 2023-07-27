package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest4{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        Object item = pilha.desempilha();
        assertEquals(10, item);
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(10);
        assertFalse(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
        pilha.empilha(20);
        assertEquals(2, pilha.tamanho());
    }
}