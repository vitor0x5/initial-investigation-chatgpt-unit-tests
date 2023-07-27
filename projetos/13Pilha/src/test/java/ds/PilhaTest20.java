package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertNotNull(p);
    }

    @Test(timeout=1000)
    public void testEmpilhaValidInput() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertEquals(1, p.tamanho());
    }

    @Test(timeout=1000)
    public void testDesempilhaValidInput() throws Exception {
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
}