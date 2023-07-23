package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest1{


    @Test
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testEmpilhaPilhaCheia() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        pilha.empilha(1001);
    }

    @Test
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        Object item = pilha.desempilha();
        assertEquals(1, item);
        assertTrue(pilha.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaPilhaVazia() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    @Test
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(1);
        assertFalse(pilha.vazia());
    }

    @Test
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha(1);
        assertEquals(1, pilha.tamanho());
        pilha.desempilha();
        assertEquals(0, pilha.tamanho());
    }
}