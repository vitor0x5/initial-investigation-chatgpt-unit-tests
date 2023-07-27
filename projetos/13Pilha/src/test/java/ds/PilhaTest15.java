package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest15{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Pilha p = new Pilha();
        assertNotNull(p);
    }

    // Test for empilha method
    @Test(timeout=1000)
    public void testEmpilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha("item1");
        assertEquals(1, p.tamanho());
        p.empilha("item2");
        assertEquals(2, p.tamanho());
    }

    // Test for desempilha method
    @Test(timeout=1000)
    public void testDesempilha() throws Exception {
        Pilha p = new Pilha();
        p.empilha("item1");
        p.empilha("item2");
        assertEquals("item2", p.desempilha());
        assertEquals(1, p.tamanho());
        assertEquals("item1", p.desempilha());
        assertEquals(0, p.tamanho());
    }

    // Test for vazia method
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Pilha p = new Pilha();
        assertTrue(p.vazia());
        p.empilha("item1");
        assertFalse(p.vazia());
    }

    // Test for tamanho method
    @Test(timeout=1000)
    public void testTamanho() throws Exception {
        Pilha p = new Pilha();
        assertEquals(0, p.tamanho());
        p.empilha("item1");
        assertEquals(1, p.tamanho());
        p.empilha("item2");
        assertEquals(2, p.tamanho());
    }
}