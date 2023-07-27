package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
    }
    
    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        assertEquals(1, pilha.tamanho());
        pilha.empilha(20);
        assertEquals(2, pilha.tamanho());
    }
    
    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(10);
        pilha.empilha(20);
        assertEquals(20, pilha.desempilha());
        assertEquals(1, pilha.tamanho());
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
        pilha.desempilha();
        assertEquals(1, pilha.tamanho());
    }
}