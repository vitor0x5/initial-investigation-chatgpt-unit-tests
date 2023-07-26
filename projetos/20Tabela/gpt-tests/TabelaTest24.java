package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest24{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        tabela.insere(reg1);
        Item reg2 = new MeuItem(20);
        tabela.insere(reg2);
        Item reg3 = new MeuItem(30);
        tabela.insere(reg3);

        int result1 = tabela.pesquisa(reg1);
        assertEquals(1, result1);

        int result2 = tabela.pesquisa(reg2);
        assertEquals(2, result2);

        int result3 = tabela.pesquisa(reg3);
        assertEquals(3, result3);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        tabela.insere(reg1);
        assertEquals(1, tabela.n);

        Item reg2 = new MeuItem(20);
        tabela.insere(reg2);
        assertEquals(2, tabela.n);

        Item reg3 = new MeuItem(30);
        tabela.insere(reg3);
        assertEquals(3, tabela.n);
    }

    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        tabela.insere(reg1);
        Item reg2 = new MeuItem(20);
        tabela.insere(reg2);
        Item reg3 = new MeuItem(30);
        tabela.insere(reg3);

        int result1 = tabela.binaria(reg1);
        assertEquals(1, result1);

        int result2 = tabela.binaria(reg2);
        assertEquals(2, result2);

        int result3 = tabela.binaria(reg3);
        assertEquals(3, result3);
    }
}