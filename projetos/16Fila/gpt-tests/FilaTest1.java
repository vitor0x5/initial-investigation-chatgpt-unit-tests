package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
    }

    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);

        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
        assertEquals(4, fila.desenfileira());
        assertEquals(5, fila.desenfileira());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Fila fila1 = new Fila();
        assertTrue(fila1.vazia());

        Fila fila2 = new Fila();
        fila2.enfileira(1);
        assertFalse(fila2.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);
        
        fila.imprime();
    }
}