package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest20{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.insere(4);
        lista.insere(5);
        lista.insere(6);
        lista.insere(7);
        lista.insere(8);
        lista.insere(9);
        lista.insere(10);
        lista.insere(11); // Boundary value
        lista.insere(12); // Boundary value
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());

        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);

        // Not possible to assert the output, so just check if it doesn't throw an exception
        lista.imprime();
    }
}