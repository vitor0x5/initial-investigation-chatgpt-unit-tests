package ds;import org.junit.Test;
import org.junit.Assert;

public class ListaTest0{


    @Test
    public void testInsere() {
        Lista lista = new Lista();
        Object item = new Object();
        try {
            lista.insere(item);
            Assert.assertEquals(item, lista.item[0]);
            Assert.assertEquals(1, lista.ultimo);
        } catch (Exception e) {
            Assert.fail("Exception thrown");
        }
    }

    @Test
    public void testVazia() {
        Lista lista = new Lista();
        Assert.assertTrue(lista.vazia());
        Object item = new Object();
        try {
            lista.insere(item);
            Assert.assertFalse(lista.vazia());
        } catch (Exception e) {
            Assert.fail("Exception thrown");
        }
    }

    @Test
    public void testImprime() {
        Lista lista = new Lista();
        Object item1 = new Object();
        Object item2 = new Object();
        try {
            lista.insere(item1);
            lista.insere(item2);
            lista.imprime();
        } catch (Exception e) {
            Assert.fail("Exception thrown");
        }
    }
}