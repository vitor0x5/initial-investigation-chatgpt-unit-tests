package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest17{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
        assertEquals(0, pilha.tamanho());
        assertTrue(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
        assertFalse(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertEquals(1, pilha.desempilha());
        assertEquals(0, pilha.tamanho());
        assertTrue(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(1);
        assertFalse(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
    }
}