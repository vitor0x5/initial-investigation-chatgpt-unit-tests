package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class FilaTest12{


    private Fila fila;

    @Before
    public void setup() {
        fila = new Fila();
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        assertNotNull(fila.item);
        assertEquals(0, fila.frente);
        assertEquals(fila.frente, fila.tras);
    }

    @Test(timeout = 1000)
    public void testEnfileiraValidInput() throws Exception {
        Object x = new Object();
        fila.enfileira(x);
        assertEquals(x, fila.item[fila.tras-1]);
        assertEquals((fila.tras + 1) % fila.item.length, fila.frente);
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testEnfileiraFullQueue() throws Exception {
        fila.frente = 0;
        fila.tras = fila.item.length - 1;
        fila.enfileira(new Object());
    }

    @Test(timeout = 1000)
    public void testDesenfileiraValidInput() throws Exception {
        fila.item[fila.frente] = new Object();
        Object item = fila.desenfileira();
        assertEquals(fila.frente, (fila.frente + 1) % fila.item.length);
        assertNotNull(item);
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testDesenfileiraEmptyQueue() throws Exception {
        fila.desenfileira();
    }

    @Test(timeout = 1000)
    public void testVaziaEmptyQueue() {
        assertTrue(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testVaziaNonEmptyQueue() {
        fila.item[fila.frente] = new Object();
        assertFalse(fila.vazia());
    }

    @Test(timeout = 1000)
    public void testImprimeEmptyQueue() {
        fila.imprime();
    }

    @Test(timeout = 1000)
    public void testImprimeNonEmptyQueue() {
        fila.item[fila.frente] = new Object();
        fila.imprime();
    }
}