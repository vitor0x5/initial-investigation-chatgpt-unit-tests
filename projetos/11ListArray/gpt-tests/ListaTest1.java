package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();

        // Test valid input
        lista.insere("test");
        assertEquals("test", lista.item[0]);

        // Test invalid input (list is full)
        try {
            for (int i = 0; i < 1000; i++) {
                lista.insere(i);
            }
            lista.insere(1001);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();

        // Test empty list
        assertTrue(lista.vazia());

        // Test non-empty list
        lista.insere("test");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();

        // Test empty list
        lista.imprime();

        // Test non-empty list
        lista.insere("test");
        lista.imprime();
    }
}