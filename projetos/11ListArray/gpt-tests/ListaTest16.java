package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        assertEquals("item1", lista.item[0]);
    }

    @Test(timeout=1000)
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        lista.imprime();
        // Check console output manually
    }
}