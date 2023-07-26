package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest9{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileiraWithValidInput() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(expected=Exception.class, timeout=1000)
    public void testDesenfileiraWithEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test(timeout=1000)
    public void testDesenfileiraWithNonEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        Object item = fila.desenfileira();
        assertEquals(1, item);
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaWithEmptyQueue() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprimeWithEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.imprime();
    }

    @Test(timeout=1000)
    public void testImprimeWithNonEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}