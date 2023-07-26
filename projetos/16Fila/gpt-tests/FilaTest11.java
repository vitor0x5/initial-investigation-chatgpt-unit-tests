package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest11{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout = 1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }

    @Test(timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        Object item = fila.desenfileira();
        assertEquals(1, item);
        fila.imprime();
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Fila fila1 = new Fila();
        assertTrue(fila1.vazia());

        Fila fila2 = new Fila();
        fila2.enfileira(1);
        assertFalse(fila2.vazia());
    }
}