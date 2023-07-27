package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest15{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    // Test for enfileira method
    @Test(timeout=1000)
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertFalse(fila.vazia());
        fila.imprime();
    }

    // Test for desenfileira method when the queue is empty
    @Test(timeout=1000, expected=Exception.class)
    public void testDesenfileiraEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    // Test for desenfileira method when the queue is not empty
    @Test(timeout=1000)
    public void testDesenfileiraNonEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
        assertFalse(fila.vazia());
        fila.imprime();
    }

    // Test for vazia method when the queue is empty
    @Test(timeout=1000)
    public void testVaziaEmptyQueue() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    // Test for vazia method when the queue is not empty
    @Test(timeout=1000)
    public void testVaziaNonEmptyQueue() {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }
}