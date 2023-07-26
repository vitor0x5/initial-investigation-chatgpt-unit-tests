package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.imprime();
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.imprime();
        Object item = fila.desenfileira();
        assertNotNull(item);
        assertEquals(10, item);
    }

    @Test(expected=Exception.class, timeout=1000)
    public void testDesenfileiraEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test(timeout=1000)
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(10);
        assertFalse(fila.vazia());
    }
}