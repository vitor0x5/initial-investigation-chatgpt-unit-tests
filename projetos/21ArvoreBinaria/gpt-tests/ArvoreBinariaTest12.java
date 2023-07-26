package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArvoreBinariaTest12{


    @Test(expected=NullPointerException.class, timeout=1000)
    public void testDefaultConstructor() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.retira(item1);
        arvore.retira(item2);
        arvore.retira(item3);
        assertNull(arvore.pesquisa(item1));
        assertNull(arvore.pesquisa(item2));
        assertNull(arvore.pesquisa(item3));
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(expected=NullPointerException.class, timeout=1000)
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(5);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.testa();
    }
}