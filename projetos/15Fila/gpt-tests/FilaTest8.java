package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest8{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        assertFalse(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        Object item = fila.desenfileira();
        assertEquals("item1", item);
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira("item1");
        assertFalse(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        fila.enfileira("item2");
        fila.imprime(); // Assuming the print method just prints to console without returning anything
    }
}