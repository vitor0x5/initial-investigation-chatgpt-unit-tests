package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest2{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertNotNull(p);
    }

    // Test for empilha method with valid input
    @Test(timeout=1000)
    public void testEmpilhaValidInput() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertEquals(1, p.tamanho());
    }

    // Test for desempilha method when stack is not empty
    @Test(timeout=1000)
    public void testDesempilhaNotEmpty() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        p.empilha(10);
        Object result = p.desempilha();
        assertEquals(10, result);
        assertEquals(1, p.tamanho());
    }

    // Test for desempilha method when stack is empty
    @Test(timeout=1000, expected=Exception.class)
    public void testDesempilhaEmpty() throws Exception {
        Pilha p = new Pilha();
        p.desempilha();
    }

    // Test for vazia method when stack is empty
    @Test(timeout=1000)
    public void testVaziaEmpty() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
    }

    // Test for vazia method when stack is not empty
    @Test(timeout=1000)
    public void testVaziaNotEmpty() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertFalse(p.vazia());
    }

    // Test for tamanho method when stack is empty
    @Test(timeout=1000)
    public void testTamanhoEmpty() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
    }

    // Test for tamanho method when stack is not empty
    @Test(timeout=1000)
    public void testTamanhoNotEmpty() throws Exception {
        Pilha p = new Pilha();
        p.empilha(5);
        assertEquals(1, p.tamanho());
    }
}