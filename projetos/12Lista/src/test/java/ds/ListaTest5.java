package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.imprime();
    }
}