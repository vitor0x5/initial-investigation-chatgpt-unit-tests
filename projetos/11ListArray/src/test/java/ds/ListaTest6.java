package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        Object item = new Object();
        lista.insere(item);
    }
    
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        boolean isEmpty = lista.vazia();
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("A");
        lista.insere("B");
        lista.insere("C");
        lista.imprime();
    }
}