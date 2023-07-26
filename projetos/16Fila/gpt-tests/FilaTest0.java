package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest0{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        assertFalse(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        fila.enfileira(10);
        fila.enfileira(15);
        assertEquals(5, fila.desenfileira());
        assertEquals(10, fila.desenfileira());
        assertEquals(15, fila.desenfileira());
        assertTrue(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(5);
        assertFalse(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        fila.enfileira(10);
        fila.enfileira(15);
        fila.imprime();
        assertFalse(fila.vazia());
    }
}