package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        assertNull(arvore.pesquisa(item));
    }
}