package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest23{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.imprime();
    }
}