package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest10{


    @Test(expected = Exception.class)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("foo");
        assertEquals("foo", lista.item[0]);
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("foo");
        assertFalse(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("foo");
        lista.insere("bar");
        lista.insere("baz");
        lista.imprime();
    }
}