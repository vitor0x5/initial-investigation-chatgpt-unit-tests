package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class FilaTest14{


    private Fila fila;

    @Before
    public void setUp() {
        fila = new Fila();
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() {
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        fila.enfileira(1);
        assertEquals(1, fila.desenfileira());
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() {
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}