package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest3{


    @Test(expected=NullPointerException.class, timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("value");
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();

        // Test true case
        assertTrue(lista.vazia());

        // Test false case
        lista.insere("value");
        assertFalse(lista.vazia());
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();

        // Test empty list
        lista.imprime();

        // Test non-empty list
        lista.insere("value1");
        lista.insere("value2");
        lista.imprime();
    }
}