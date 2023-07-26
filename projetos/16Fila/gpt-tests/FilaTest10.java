package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest10{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(1);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesenfileiraEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test(timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        Object item = fila.desenfileira();
        assertEquals(1, item);
    }

    @Test(timeout = 1000)
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.imprime();
    }
}