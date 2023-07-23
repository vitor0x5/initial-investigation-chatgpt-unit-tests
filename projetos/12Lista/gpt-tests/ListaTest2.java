package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ListaTest2{


    private Lista lista;

    @Before
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testInsere() {
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        assertFalse(lista.vazia());
    }

    @Test
    public void testVazia() {
        assertTrue(lista.vazia());
        lista.insere("Item 1");
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprime() {
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        lista.imprime();
        // Since System.out.println() cannot be tested directly, 
        // we can only check if the method runs without throwing an exception.
    }
}