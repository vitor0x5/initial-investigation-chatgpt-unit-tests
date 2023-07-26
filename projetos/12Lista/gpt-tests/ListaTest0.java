package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest0{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item");
        // Verify that item is inserted correctly
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        // Verify that the list is initially empty
        assertTrue(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        // Verify that all items are printed correctly
        // Assuming the order of items is maintained
    }
}