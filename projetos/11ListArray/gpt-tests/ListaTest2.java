package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest2{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        assertEquals("Test", lista.item[0]);
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test1");
        lista.insere("Test2");
        lista.insere("Test3");
        lista.imprime();
        // Since the method only prints to the console, we can't assert the output
        // We can only check if the method runs without any exceptions
    }
}