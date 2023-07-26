package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest4{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    // Test for insere method with valid input
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item");
        assertFalse(lista.vazia());
    }

    // Test for vazia method with an empty list
    @Test(timeout=1000)
    public void testVaziaEmpty() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    // Test for vazia method with a non-empty list
    @Test(timeout=1000)
    public void testVaziaNonEmpty() throws Exception {
        Lista lista = new Lista();
        lista.insere("item");
        assertFalse(lista.vazia());
    }

    // Test for imprime method with an empty list
    @Test(timeout=1000)
    public void testImprimeEmpty() throws Exception {
        Lista lista = new Lista();
        lista.imprime();
    }

    // Test for imprime method with a non-empty list
    @Test(timeout=1000)
    public void testImprimeNonEmpty() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.imprime();
    }
}