package ds;import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.Ignore;

public class ArvoreBinariaTest7{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }
    
    @Test(timeout=1000)
    public void testPesquisaTrue() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        Item result = arvore.pesquisa(item);
        assertSame(item, result);
    }
    
    @Test(timeout=1000)
    public void testPesquisaFalse() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        Item result = arvore.pesquisa(new MeuItem(20));
        assertNull(result);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }
    
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }
    
    @Test(timeout=1000)
    public void testRetiraNotFound() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(new MeuItem(20));
        assertNotNull(arvore.pesquisa(item));
    }
    
    @Test(timeout=1000)
    public void testAntecessor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
    }
}