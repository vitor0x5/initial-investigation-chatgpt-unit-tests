package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTest0{


    @Test
    public void testListaConstructor() {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test
    public void testInsere() {
        Lista lista = new Lista();
        lista.insere(10);
        assertFalse(lista.vazia());
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        lista.insere(10);
        lista.insere(20);
        lista.insere(30);
        lista.insere(40);
        lista.insere(50);
        lista.imprime();
        // Manually check the output
    }
}