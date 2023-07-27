package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testPesquisaTrue() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        assertSame(item, arvore.pesquisa(item));
    }

    @Test(timeout=1000)
    public void testPesquisaFalse() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        arvore.insere(item1);
        assertNull(arvore.pesquisa(item2));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(5);
        arvore.insere(item);
        assertSame(item, arvore.pesquisa(item));
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
    public void testCentral() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(15);
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);
    }

    private class MeuItem implements Item {
        private int chave;

        public MeuItem (int chave) { this.chave = chave; }

        public int compara (Item it) {
            MeuItem item = (MeuItem) it;
            if (this.chave < item.chave) return -1;
            else if (this.chave > item.chave) return 1;
            return 0;
        }

        public void alteraChave (Object chave) {
            Integer ch = (Integer) chave; this.chave = ch.intValue ();
        }

        public Object recuperaChave () { return new Integer (this.chave); }

        public String toString () { return "" + this.chave; }
    }
}