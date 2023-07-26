package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest7{


    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout = 1000)
    public void testInsere() {
        Lista lista = new Lista();
        lista.insere(5);
        assertFalse(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testVaziaTrue() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testVaziaFalse() {
        Lista lista = new Lista();
        lista.insere(5);
        assertFalse(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testImprimeWithNullItem() {
        Lista lista = new Lista();
        lista.insere(null);
        lista.imprime();
    }

    @Test(timeout = 1000)
    public void testImprimeWithNonNullItem() {
        Lista lista = new Lista();
        lista.insere(5);
        lista.imprime();
    }
}