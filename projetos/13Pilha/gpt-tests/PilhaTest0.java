package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest0{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertNotNull(p);
        assertEquals(0, p.tamanho());
    }

    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(1);
        assertEquals(1, p.tamanho());
        p.empilha(2);
        assertEquals(2, p.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(1);
        p.empilha(2);
        assertEquals(2, p.desempilha());
        assertEquals(1, p.tamanho());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
        p.empilha(1);
        assertFalse(p.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
        p.empilha(1);
        assertEquals(1, p.tamanho());
        p.empilha(2);
        assertEquals(2, p.tamanho());
    }
}