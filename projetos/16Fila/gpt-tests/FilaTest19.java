package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest19{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        assertFalse(fila.vazia());
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
        assertTrue(fila.vazia());
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
    }
}