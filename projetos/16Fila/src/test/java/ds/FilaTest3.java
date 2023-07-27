package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest3{


    @Test
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(10);
        assertFalse(fila.vazia());
        fila.enfileira(20);
        fila.enfileira(30);
        assertFalse(fila.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);

        assertEquals(10, fila.desenfileira());
        assertEquals(20, fila.desenfileira());
        assertEquals(30, fila.desenfileira());

        fila.desenfileira(); // should throw an exception
    }

    @Test(timeout = 1000)
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());

        fila.enfileira(10);
        assertFalse(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);

        fila.imprime(); // should print "10 20 30"
    }
}