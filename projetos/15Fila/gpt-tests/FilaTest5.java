package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test");
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test");
        assertEquals("Test", fila.desenfileira());
    }

    @Test(timeout=1000, expected=Exception.class)
    public void testDesenfileiraEmpty() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test(timeout=1000)
    public void testVaziaTrue() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaFalse() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test");
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Test1");
        fila.enfileira("Test2");
        fila.enfileira("Test3");
        fila.imprime();
    }
}