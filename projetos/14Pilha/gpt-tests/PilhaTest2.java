package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest2{


    @Test
    public void testConstrutor() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilha() {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        Object item = pilha.desempilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
        assertEquals(1, item);
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }
}