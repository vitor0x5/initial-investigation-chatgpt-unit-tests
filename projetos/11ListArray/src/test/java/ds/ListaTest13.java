package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsereTrue() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaTrue() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaFalse() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test1");
        lista.insere("Test2");
        lista.insere("Test3");
        lista.imprime();
    }
}