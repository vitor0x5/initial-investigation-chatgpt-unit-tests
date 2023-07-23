package ds;import org.junit.Test;
import java.util.Random;

public class TabelaTest1{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item item = new MeuItem(10);
        tabela.insere(item);
        assert tabela.pesquisa(item) == 1;
    }

    @Test
    public void testInsere() {
        Tabela tabela = new Tabela();
        Item item = new MeuItem(10);
        try {
            tabela.insere(item);
        } catch (Exception e) {
            assert false;
        }
        assert tabela.n == 1;
    }

    @Test(expected = Exception.class)
    public void testInsereException() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        tabela.insere(item1);
        tabela.insere(item2);
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        tabela.insere(item1);
        tabela.insere(item2);
        assert tabela.binaria(item1) == 1;
        assert tabela.binaria(item2) == 2;
    }
}