package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Fila;

public class FilaTest11{


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
    public void testEnfileiraFilaCheia() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira(i);
        }
        try {
            fila.enfileira(1001);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        Object item = fila.desenfileira();
        assertEquals(1, item);
    }

    @Test(timeout=1000)
    public void testDesenfileiraFilaVazia() throws Exception {
        Fila fila = new Fila();
        try {
            fila.desenfileira();
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}