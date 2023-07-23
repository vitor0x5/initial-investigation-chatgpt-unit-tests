package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest2{


    private Fila fila;

    @Before
    public void setUp() {
        fila = new Fila();
    }

    @Test
    public void testEnfileira() {
        fila.enfileira(1);
        assertEquals(false, fila.vazia());
    }

    @Test
    public void testDesenfileira() throws Exception {
        fila.enfileira(1);
        fila.enfileira(2);
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(true, fila.vazia());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraException() throws Exception {
        fila.desenfileira();
    }

    @Test
    public void testVazia() {
        assertEquals(true, fila.vazia());
        fila.enfileira(1);
        assertEquals(false, fila.vazia());
    }

    @Test
    public void testImprime() {
        fila.enfileira(1);
        fila.enfileira(2);
        fila.imprime();
    }
}