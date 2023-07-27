package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ArvoreBinariaTest3{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }
    
    @Test(timeout=1000)
    public void testPesquisaWithValidInput() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        Item pesquisa = arvore.pesquisa(item);
        assertEquals(item, pesquisa);
    }
    
    @Test(timeout=1000)
    public void testPesquisaWithInvalidInput() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        Item pesquisa = arvore.pesquisa(item);
        assertNull(pesquisa);
    }
    
    @Test(timeout=1000)
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        Item pesquisa = arvore.pesquisa(item);
        assertEquals(item, pesquisa);
    }
    
    @Test(timeout=1000)
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        arvore.retira(item);
        Item pesquisa = arvore.pesquisa(item);
        assertNull(pesquisa);
    }
    
    @Test(timeout=1000)
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(15);
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);
        arvore.testa();
        // TODO: assert the output of System.out.println
    }
}