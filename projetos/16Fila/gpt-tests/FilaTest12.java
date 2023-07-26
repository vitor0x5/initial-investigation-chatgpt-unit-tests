package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    // Test cases for enfileira method
    @Test(timeout=1000)
    public void testEnfileiraWithValidInput() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    // Test cases for desenfileira method
    @Test(timeout=1000)
    public void testDesenfileiraWithNonEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        Object item = fila.desenfileira();
        assertEquals(1, item);
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000, expected=Exception.class)
    public void testDesenfileiraWithEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    // Test case for vazia method
    @Test(timeout=1000)
    public void testVaziaWithEmptyFila() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaWithNonEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    // Test case for imprime method
    @Test(timeout=1000)
    public void testImprimeWithNonEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}