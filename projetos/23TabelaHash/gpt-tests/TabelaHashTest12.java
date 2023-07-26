package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest12{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNull(tabela.pesquisa("chave"));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave", new Object());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.retira("chave");
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        Object[] itens = tabela.recuperaItens();
        assertEquals(0, itens.length);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.imprime();
    }
}