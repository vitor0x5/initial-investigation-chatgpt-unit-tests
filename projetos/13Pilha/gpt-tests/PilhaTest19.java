package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest19{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    @Test(timeout = 1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("item1");
        Object item = pilha.desempilha();
        assertEquals("item1", item);
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha("item1");
        assertFalse(pilha.vazia());
    }

    @Test(timeout = 1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha("item1");
        assertEquals(1, pilha.tamanho());
    }
}