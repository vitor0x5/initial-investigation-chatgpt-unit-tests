package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest15{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(5);
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(5);
        lista.insere(10);
        lista.insere(15);
        lista.imprime();
    }
}