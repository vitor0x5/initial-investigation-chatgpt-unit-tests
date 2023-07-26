package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest11{


    @Test(expected = Exception.class, timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test(expected = Exception.class, timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();

        lista.insere(null);
    }

    @Test(expected = Exception.class, timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();

        assertTrue(lista.vazia());
        lista.insere(null);
        assertFalse(lista.vazia());
    }

    @Test(expected = Exception.class, timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();

        lista.imprime();
    }
}