package ds;import static org.junit.Assert.*;
import org.junit.*;

public class PilhaTest10{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertNotNull(p);
    }
    
    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha p = new Pilha();
        
        p.empilha(10);
        assertEquals(1, p.tamanho());
        
        p.empilha(-5);
        assertEquals(2, p.tamanho());
        
        p.empilha(0);
        assertEquals(3, p.tamanho());
    }
    
    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        
        p.empilha(10);
        p.empilha(-5);
        p.empilha(0);
        
        Object item = p.desempilha();
        assertEquals(0, item);
        assertEquals(2, p.tamanho());
        
        item = p.desempilha();
        assertEquals(-5, item);
        assertEquals(1, p.tamanho());
        
        item = p.desempilha();
        assertEquals(10, item);
        assertEquals(0, p.tamanho());
    }
    
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha p = new Pilha();
        
        assertTrue(p.vazia());
        
        p.empilha(10);
        assertFalse(p.vazia());
        
        p.desempilha();
        assertTrue(p.vazia());
    }
    
    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha p = new Pilha();
        
        assertEquals(0, p.tamanho());
        
        p.empilha(10);
        assertEquals(1, p.tamanho());
        
        p.desempilha();
        assertEquals(0, p.tamanho());
    }
}