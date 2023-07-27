package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest1{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    // Test for insere method with valid input
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(5);
        assertFalse(lista.vazia());
    }

    // Test for vazia method when List is empty
    @Test(timeout=1000)
    public void testVaziaEmpty() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    // Test for vazia method when List is not empty
    @Test(timeout=1000)
    public void testVaziaNotEmpty() throws Exception {
        Lista lista = new Lista();
        lista.insere(5);
        assertFalse(lista.vazia());
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.insere(4);
        lista.insere(5);
        lista.imprime();
    }
}