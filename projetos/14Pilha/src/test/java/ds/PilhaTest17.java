package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest17{


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
        assertFalse(p.vazia());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(10);
        p.empilha(20);
        Object item = p.desempilha();
        assertEquals(20, item);
        assertEquals(1, p.tamanho());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
        p.empilha(10);
        assertFalse(p.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
        p.empilha(10);
        p.empilha(20);
        assertEquals(2, p.tamanho());
    }
}