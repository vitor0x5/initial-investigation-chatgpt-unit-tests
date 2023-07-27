package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        Object item = fila.desenfileira();
        assertTrue(fila.vazia());
        assertEquals(1, item);
    }

    @Test(timeout=1000)
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
    }
}