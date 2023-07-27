package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileiraValidInput() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        // Assert that the item was enqueued successfully
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000, expected=Exception.class)
    public void testDesenfileiraEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
        // Expect an exception to be thrown as the fila is empty
    }

    @Test(timeout=1000)
    public void testDesenfileiraNonEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        Object item = fila.desenfileira();
        // Assert that the item was dequeued successfully
        assertEquals(5, item);
    }

    @Test(timeout=1000)
    public void testVaziaEmptyFila() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaNonEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprimeEmptyFila() {
        Fila fila = new Fila();
        fila.imprime();
        // Check console output manually to verify correctness
    }

    @Test(timeout=1000)
    public void testImprimeNonEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        fila.imprime();
        // Check console output manually to verify correctness
    }
}