package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TabelaHashTest11{


    private TabelaHash tabela;

    @Test(timeout = 1000)
    public void testPesquisa() throws Exception {
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertNull(tabela.pesquisa("chave2"));
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
        assertNull(tabela.pesquisa("chave4"));
    }

    @Test(timeout = 1000)
    public void testRetira() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.retira("chave2");
        assertNull(tabela.pesquisa("chave2"));
    }

    @Test(timeout = 1000)
    public void testRecuperaItens() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        Object[] itens = tabela.recuperaItens();
        assertEquals(3, itens.length);
        assertArrayEquals(new Object[]{"item1", "item2", "item3"}, itens);
    }
}