package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ArvoreBinariaTest14{

    
    @Test(timeout=1000, expected=Exception.class)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arvore.pesquisa(reg);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arvore.insere(reg);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arvore.retira(reg);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testCentral() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        ArvoreBinaria.No p = new ArvoreBinaria.No();
        arvore.central(p);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testPesquisaNo() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        ArvoreBinaria.No p = new ArvoreBinaria.No();
        arvore.pesquisa(reg, p);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testInsereNo() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        ArvoreBinaria.No p = new ArvoreBinaria.No();
        arvore.insere(reg, p);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testAntecessor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        ArvoreBinaria.No q = new ArvoreBinaria.No();
        ArvoreBinaria.No r = new ArvoreBinaria.No();
        arvore.antecessor(q, r);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testRetiraNo() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        ArvoreBinaria.No p = new ArvoreBinaria.No();
        arvore.retira(reg, p);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testTesta() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        ArvoreBinaria.No p = new ArvoreBinaria.No();
        arvore.testa(p);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testTestaArvore() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.testa();
    }
}