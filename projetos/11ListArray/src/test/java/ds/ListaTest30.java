package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest30{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
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
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("item1");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        lista.imprime();
    }
}