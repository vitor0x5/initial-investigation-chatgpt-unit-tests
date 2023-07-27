package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ArvoreBinariaTest14{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arvore.pesquisa(reg);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arvore.insere(reg);
    }
    
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arvore.retira(reg);
    }
    
    @Test(timeout=1000)
    public void testTestaArvore() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.testa();
    }
}