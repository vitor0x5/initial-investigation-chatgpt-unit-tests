package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest12{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
    }
    
    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertEquals(1, p.tamanho());
    }
    
    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        Object result = p.desempilha();
        assertEquals(0, p.tamanho());
        assertEquals(5, result);
    }
    
    @Test(timeout=1000)
    public void testVaziaTrue() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
    }
    
    @Test(timeout=1000)
    public void testVaziaFalse() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertFalse(p.vazia());
    }
    
    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        p.empilha(10);
        assertEquals(2, p.tamanho());
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testEmpilhaFull() throws Exception {
        Pilha p = new Pilha();
        for(int i = 0; i < 1000; i++) {
            p.empilha(i);
        }
        p.empilha(1001);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testDesempilhaEmpty() throws Exception {
        Pilha p = new Pilha();
        p.desempilha();
    }
}