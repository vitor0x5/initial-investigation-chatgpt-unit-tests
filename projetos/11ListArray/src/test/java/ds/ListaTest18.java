package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
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
    }
}