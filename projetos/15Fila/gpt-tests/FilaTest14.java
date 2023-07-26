package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test");
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test");
        Object item = fila.desenfileira();
        assertEquals("Test", item);
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira("Test");
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test1");
        fila.enfileira("Test2");
        fila.enfileira("Test3");
        fila.imprime();
        // Check output manually
    }
}