package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest15{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    // Test for enfileira method with valid input
    @Test(timeout=1000)
    public void testEnfileiraValidInput() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        assertFalse(fila.vazia());
    }

    // Test for enfileira method when the queue is full
    @Test(timeout=1000, expected=Exception.class)
    public void testEnfileiraQueueFull() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira(i);
        }
        fila.enfileira(1000);
    }

    // Test for desenfileira method with valid input
    @Test(timeout=1000)
    public void testDesenfileiraValidInput() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        Object item = fila.desenfileira();
        assertEquals(5, item);
    }

    // Test for desenfileira method when the queue is empty
    @Test(timeout=1000, expected=Exception.class)
    public void testDesenfileiraQueueEmpty() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    // Test for vazia method when the queue is empty
    @Test(timeout=1000)
    public void testVaziaQueueEmpty() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    // Test for vazia method when the queue is not empty
    @Test(timeout=1000)
    public void testVaziaQueueNotEmpty() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        assertFalse(fila.vazia());
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        fila.enfileira(10);
        fila.enfileira(15);
        fila.imprime();
    }
}