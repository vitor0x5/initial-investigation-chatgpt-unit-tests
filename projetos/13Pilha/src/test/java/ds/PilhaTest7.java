package ds;import ds.Pilha;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest7{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        Pilha pilha = new Pilha();
        assertNotNull(pilha);
        assertEquals(0, pilha.tamanho());
    }

    @Test(timeout = 1000)
    public void testEmpilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("elemento1");
        assertEquals(1, pilha.tamanho());
        pilha.empilha("elemento2");
        assertEquals(2, pilha.tamanho());
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testEmpilhaFull() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha("elemento");
        }
        pilha.empilha("elementoExtra");
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testDesempilhaEmpty() throws Exception {
        Pilha pilha = new Pilha();
        pilha.desempilha();
    }

    @Test(timeout = 1000)
    public void testDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("elemento1");
        pilha.empilha("elemento2");
        assertEquals("elemento2", pilha.desempilha());
        assertEquals(1, pilha.tamanho());
        assertEquals("elemento1", pilha.desempilha());
        assertEquals(0, pilha.tamanho());
    }
}