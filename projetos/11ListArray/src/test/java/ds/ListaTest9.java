package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest9{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }

    @Test(timeout=1000)
    public void testInsereValidInput() throws Exception {
        Lista lista = new Lista();
        lista.insere("input");
        assertEquals(1, lista.ultimo);
    }

    @Test(timeout=1000)
    public void testInsereFullList() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere("input");
        }
        try {
            lista.insere("input");
            fail("Expected an Exception");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testVaziaEmptyList() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test(timeout=1000)
    public void testVaziaNonEmptyList() throws Exception {
        Lista lista = new Lista();
        lista.insere("input");
        assertFalse(lista.vazia());
    }

    @Test(timeout=1000)
    public void testImprimeEmptyList() throws Exception {
        Lista lista = new Lista();
        lista.imprime(); // nothing to assert or compare, just checking if it throws an exception
    }

    @Test(timeout=1000)
    public void testImprimeNonEmptyList() throws Exception {
        Lista lista = new Lista();
        lista.insere("input1");
        lista.insere("input2");
        lista.imprime(); // nothing to assert or compare, just checking if it throws an exception
    }
}