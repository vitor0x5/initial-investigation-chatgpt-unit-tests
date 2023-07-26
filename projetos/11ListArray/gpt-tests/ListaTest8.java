package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest8{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(null);
        
        lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere(i);
        }
        lista.insere(1001);
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
        lista.insere("Test1");
        lista.insere("Test2");
        lista.imprime();
    }
}