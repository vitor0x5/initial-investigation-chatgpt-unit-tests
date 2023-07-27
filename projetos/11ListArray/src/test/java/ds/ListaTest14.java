package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListaTest14{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Lista lista = new Lista();
        assertEquals(1000, lista.item.length);
        assertEquals(-1, lista.pos);
        assertEquals(0, lista.primeiro);
        assertEquals(0, lista.ultimo);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        Object x = new Object();
        lista.insere(x);
        assertEquals(x, lista.item[0]);
        assertEquals(1, lista.ultimo);
    }
    
    @Test(timeout=1000)
    public void testInsereException() {
        try {
            Lista lista = new Lista();
            for (int i = 0; i < 1001; i++) {
                lista.insere(new Object());
            }
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
        }
    }
    
    @Test(timeout=1000)
    public void testVaziaTrue() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }
    
    @Test(timeout=1000)
    public void testVaziaFalse() throws Exception {
        Lista lista = new Lista();
        lista.insere(new Object());
        assertFalse(lista.vazia());
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        Object x1 = new Object();
        Object x2 = new Object();
        lista.insere(x1);
        lista.insere(x2);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        lista.imprime();
        assertEquals(x1.toString() + "\n" + x2.toString() + "\n", outContent.toString());
    }
}