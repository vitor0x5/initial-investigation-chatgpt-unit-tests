package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.ArvoreBinaria;
import ds.Item;

public class ArvoreBinariaTest11{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    // Test for method pesquisa(Item)
    @Test(timeout=1000)
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        assertNull(arvore.pesquisa(item));
    }

    // Test for method insere(Item)
    @Test(timeout=1000)
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }

    // Test for method retira(Item)
    @Test(timeout=1000)
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }
}