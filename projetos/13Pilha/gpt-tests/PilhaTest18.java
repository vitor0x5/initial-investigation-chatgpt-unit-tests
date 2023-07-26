package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class PilhaTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
    }

    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(10);
        assertEquals(1, p.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha(10);
        assertEquals(10, p.desempilha());
        assertEquals(0, p.tamanho());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
    }

    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha p = new Pilha();
        p.empilha(10);
        assertEquals(1, p.tamanho());
    }
}