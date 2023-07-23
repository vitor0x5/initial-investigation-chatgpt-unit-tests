package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaTest2{


    @Test
    public void testPilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaDesempilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("elemento1");
        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());

        Object elemento = pilha.desempilha();
        assertEquals("elemento1", elemento);
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void testEmpilhaMaxCapacity() throws Exception {
        Pilha pilha = new Pilha();
        for (int i = 0; i < 1000; i++) {
            pilha.empilha(i);
        }
        assertFalse(pilha.vazia());
        assertEquals(1000, pilha.tamanho());
        try {
            pilha.empilha(1001);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
        }
    }

    @Test
    public void testDesempilhaEmptyPilha() {
        Pilha pilha = new Pilha();
        try {
            pilha.desempilha();
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
        }
    }
}