package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest4{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Test");
        assertFalse(lista.vazia());
    }
    
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        
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