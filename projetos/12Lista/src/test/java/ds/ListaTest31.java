package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest31{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        lista.insere(20);
        lista.insere(30);
        lista.imprime();
    }
}