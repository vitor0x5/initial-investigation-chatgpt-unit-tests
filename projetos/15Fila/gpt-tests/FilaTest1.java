package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest1{


    @Test
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");

        assertEquals("Item 1", fila.item[fila.frente]);
        assertEquals("Item 2", fila.item[(fila.frente + 1) % fila.item.length]);
        assertEquals("Item 3", fila.item[(fila.frente + 2) % fila.item.length]);
    }

    @Test(expected = Exception.class)
    public void testEnfileiraFilaCheia() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < fila.item.length - 1; i++) {
            fila.enfileira("Item " + (i + 1));
        }
        fila.enfileira("Item 1001"); // Should throw exception
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");

        assertEquals("Item 1", fila.desenfileira());
        assertEquals("Item 2", fila.desenfileira());
        assertEquals("Item 3", fila.desenfileira());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraFilaVazia() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira(); // Should throw exception
    }

    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());

        fila.enfileira("Item 1");
        assertFalse(fila.vazia());

        fila.desenfileira();
        assertTrue(fila.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        fila.enfileira("Item 3");

        fila.imprime(); // Output should be "Item 1\nItem 2\nItem 3"
    }
}