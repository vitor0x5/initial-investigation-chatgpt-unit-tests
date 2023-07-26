package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest32{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        int result = tabela.pesquisa(reg);
        assertEquals(1, result);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        assertEquals(1, tabela.n);
        assertEquals(reg, tabela.registros[1]);
    }

    @Test(timeout=1000)
    public void testInsereFullTable() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 0; i < 10; i++) {
            Item reg = new MeuItem(i);
            tabela.insere(reg);
        }
        Item reg = new MeuItem(11);
        try {
            tabela.insere(reg);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 0; i < 10; i++) {
            Item reg = new MeuItem(i);
            tabela.insere(reg);
        }
        Item chave = new MeuItem(5);
        int result = tabela.binaria(chave);
        assertEquals(5, result);
    }
}