package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest20{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesenfileiraEmpty() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test(timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}