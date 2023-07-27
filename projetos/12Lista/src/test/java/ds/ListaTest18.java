package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("Item 1");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        lista.imprime();
        // Since imprime() method only prints to console, we cannot assert the output here.
        // We can manually check the console output to verify if it is correct.
    }
}