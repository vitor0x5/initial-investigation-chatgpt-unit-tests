package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest2{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    // Test for enfileira method with valid input
    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item");
        assertFalse(fila.vazia());
    }

    // Test for enfileira method when the fila is full
    @Test(expected=Exception.class, timeout=1000)
    public void testEnfileiraFull() throws Exception {
        Fila fila = new Fila();
        for(int i = 0; i < 1000; i++) {
            fila.enfileira("item");
        }
        fila.enfileira("item");
    }

    // Test for desenfileira method with valid input
    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item");
        Object item = fila.desenfileira();
        assertEquals("item", item);
        assertTrue(fila.vazia());
    }

    // Test for desenfileira method when the fila is empty
    @Test(expected=Exception.class, timeout=1000)
    public void testDesenfileiraEmpty() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    // Test for vazia method when the fila is empty
    @Test(timeout=1000)
    public void testVaziaEmpty() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    // Test for vazia method when the fila is not empty
    @Test(timeout=1000)
    public void testVaziaNotEmpty() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item");
        assertFalse(fila.vazia());
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("item1");
        fila.enfileira("item2");
        fila.enfileira("item3");
        fila.imprime();
        // Output should be "item1", "item2", "item3"
    }
}