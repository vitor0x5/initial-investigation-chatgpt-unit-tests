package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest1{


    @Test
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test(expected = Exception.class)
    public void testInsereFullList() throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.insere(i);
        }
        lista.insere(1001);
    }

    @Test
    public void testVaziaEmptyList() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }

    @Test
    public void testVaziaNonEmptyList() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        assertFalse(lista.vazia());
    }

    @Test
    public void testImprimeEmptyList() {
        Lista lista = new Lista();
        lista.imprime();
    }

    @Test
    public void testImprimeNonEmptyList() throws Exception {
        Lista lista = new Lista();
        lista.insere(1);
        lista.imprime();
    }
}