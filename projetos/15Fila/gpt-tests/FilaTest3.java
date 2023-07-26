package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest3{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        assertEquals("Item 1", fila.item[0]);
        assertEquals("Item 2", fila.item[1]);
        assertEquals("Item 3", fila.item[2]);
    }

    @Test(timeout=1000)
    public void testEnfileiraFull() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira("Item " + i);
        }
        try {
            fila.enfileira("Item 1000");
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        Object item = fila.desenfileira();
        assertEquals("Item 1", item);
        item = fila.desenfileira();
        assertEquals("Item 2", item);
        item = fila.desenfileira();
        assertEquals("Item 3", item);
    }

    @Test(timeout=1000)
    public void testDesenfileiraEmpty() throws Exception {
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
        fila.enfileira("Item 1");
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");
        fila.imprime();
        // No assertions for System.out.println()
    }
}