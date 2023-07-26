package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest4{


    // Test for default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    // Test for enfileira method with valid input
    @Test(timeout = 1000)
    public void testEnfileiraValidInput() {
        Fila fila = new Fila();
        fila.enfileira(5);
        fila.enfileira(10);
        fila.enfileira(15);
        assertEquals(3, fila.size());
    }

    // Test for desenfileira method
    @Test(timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(5);
        fila.enfileira(10);
        fila.enfileira(15);
        Object item = fila.desenfileira();
        assertEquals(5, item);
        assertEquals(2, fila.size());
    }

    // Test for vazia method when the queue is empty
    @Test(timeout = 1000)
    public void testVaziaEmptyQueue() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    // Test for vazia method when the queue is not empty
    @Test(timeout = 1000)
    public void testVaziaNonEmptyQueue() {
        Fila fila = new Fila();
        fila.enfileira(5);
        assertFalse(fila.vazia());
    }
}