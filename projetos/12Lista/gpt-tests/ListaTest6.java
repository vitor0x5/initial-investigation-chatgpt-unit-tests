package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest6{


    // Test for the default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    // Test for the insere method with valid input
    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        assertFalse(lista.vazia());
    }

    // Test for the vazia method when the list is empty
    @Test(timeout = 1000)
    public void testVaziaEmpty() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    // Test for the vazia method when the list is not empty
    @Test(timeout = 1000)
    public void testVaziaNotEmpty() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        assertFalse(lista.vazia());
    }

    // Test for the imprime method
    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        lista.imprime();
        // There is no assert for this test since it is just printing the elements
    }
}