package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest22{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.item[0]);
        assertEquals(2, fila.item[1]);
        assertEquals(3, fila.item[2]);
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
        // The output should be "1\n2\n3\n"
    }
}