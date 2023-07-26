package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class ListaTest5{


    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Test
    public void testLista() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test
    public void testInsereTrue() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        assertFalse(lista.vazia());
    }

    @Test
    public void testInsereFalse() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere(i);
        }
        assertTrue(lista.vazia());
    }

    @Test
    public void testVaziaTrue() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test
    public void testVaziaFalse() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        lista.insere(20);
        lista.imprime();
        // No assertions needed for this method
    }
}