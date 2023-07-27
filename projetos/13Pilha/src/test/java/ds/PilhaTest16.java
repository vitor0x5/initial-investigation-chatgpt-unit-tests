package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }

    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("Item 1");
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("Item 1");
        pilha.empilha("Item 2");
        Object item = pilha.desempilha();
        assertEquals("Item 2", item);
        assertEquals(1, pilha.tamanho());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        pilha.empilha("Item 1");
        assertFalse(pilha.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
        pilha.empilha("Item 1");
        assertEquals(1, pilha.tamanho());
        pilha.empilha("Item 2");
        assertEquals(2, pilha.tamanho());
    }
}