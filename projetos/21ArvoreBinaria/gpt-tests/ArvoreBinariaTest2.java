package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.ArvoreBinaria;
import ds.Item;

public class ArvoreBinariaTest2{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    // Test for pesquisa method
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(20);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        Item result1 = arvore.pesquisa(item1);
        assertSame(item1, result1);
        Item result2 = arvore.pesquisa(item2);
        assertSame(item2, result2);
        Item result3 = arvore.pesquisa(item3);
        assertSame(item3, result3);
        Item result4 = arvore.pesquisa(new MeuItem(15));
        assertNull(result4);
    }

    // Test for insere method
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(20);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        Item result1 = arvore.pesquisa(item1);
        assertSame(item1, result1);
        Item result2 = arvore.pesquisa(item2);
        assertSame(item2, result2);
        Item result3 = arvore.pesquisa(item3);
        assertSame(item3, result3);
    }

    // Test for retira method
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(20);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.retira(item1);
        Item result1 = arvore.pesquisa(item1);
        assertNull(result1);
        Item result2 = arvore.pesquisa(item2);
        assertSame(item2, result2);
        Item result3 = arvore.pesquisa(item3);
        assertSame(item3, result3);
    }

    // Test for testa method
    @Test(timeout=1000)
    public void testTesta() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(20);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.testa();
    }
}