package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        assertEquals(10, fila.item[0]);
        assertEquals(20, fila.item[1]);
        assertEquals(30, fila.item[2]);
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        assertEquals(10, fila.desenfileira());
        assertEquals(20, fila.desenfileira());
        assertEquals(30, fila.desenfileira());
    }

    @Test(timeout=1000)
    public void testDesenfileira_EmptyQueue() throws Exception {
        Fila fila = new Fila();
        try {
            fila.desenfileira();
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(10);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.imprime();
        // Since System.out.println() does not return anything, we cannot assert anything here
    }
}