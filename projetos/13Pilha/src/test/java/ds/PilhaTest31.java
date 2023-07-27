package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest31{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        Object result = pilha.desempilha();
        assertEquals(0, pilha.tamanho());
        assertEquals(5, result);
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(5);
        pilha.empilha(10);
        assertEquals(2, pilha.tamanho());
    }
}