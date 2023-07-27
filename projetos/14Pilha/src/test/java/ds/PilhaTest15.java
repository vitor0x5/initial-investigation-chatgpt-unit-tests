package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest15{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    @Test(timeout=1000)
    public void testEmpilha() {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        pilha.empilha(2);
        Object item = pilha.desempilha();
        assertEquals(2, item);
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        pilha.empilha(2);
        assertEquals(2, pilha.tamanho());
    }
}