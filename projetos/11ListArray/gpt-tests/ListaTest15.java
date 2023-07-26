package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest15{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        assertEquals(3, lista.ultimo - lista.primeiro);
        assertEquals("Item 1", lista.item[0]);
        assertEquals("Item 2", lista.item[1]);
        assertEquals("Item 3", lista.item[2]);
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("Item");
        assertFalse(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        lista.imprime();
        // Assertion for console output can't be done in JUnit
    }
}