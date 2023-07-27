package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest14{

    
    @Test( timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
    }
    
    @Test( timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("Item 1");
        assertEquals(1, pilha.tamanho());
    }
    
    @Test( timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("Item 1");
        Object item = pilha.desempilha();
        assertEquals("Item 1", item);
        assertEquals(0, pilha.tamanho());
    }
    
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
    }
    
    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha pilha = new Pilha();
        assertEquals(0, pilha.tamanho());
    }
    
}