package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest19{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        fila.enfileira("item2");
        fila.enfileira("item3");
        assertEquals("item1", fila.item[0]);
        assertEquals("item2", fila.item[1]);
        assertEquals("item3", fila.item[2]);
    }

    @Test(timeout=1000)
    public void testEnfileiraFull() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira("item" + i);
        }
        try {
            fila.enfileira("item1000");
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        fila.enfileira("item2");
        fila.enfileira("item3");
        Object item = fila.desenfileira();
        assertEquals("item1", item);
        assertEquals("item2", fila.item[1]);
        assertEquals("item3", fila.item[2]);
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
        fila.enfileira("item1");
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        fila.enfileira("item2");
        fila.enfileira("item3");
        fila.imprime();
    }
}