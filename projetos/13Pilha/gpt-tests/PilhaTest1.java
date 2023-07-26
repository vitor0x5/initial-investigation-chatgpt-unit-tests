package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class PilhaTest1{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
        assertEquals(0, pilha.tamanho());
        assertTrue(pilha.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        pilha.empilha(20);
        assertEquals(2, pilha.tamanho());
        assertEquals(20, pilha.desempilha());
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha(10);
        assertFalse(pilha.vazia());
    }
}