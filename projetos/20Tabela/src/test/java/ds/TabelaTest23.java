package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela.registros);
        assertEquals(0, tabela.n);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.registros[3] = new MeuItem(3);
        tabela.registros[4] = new MeuItem(4);
        tabela.registros[5] = new MeuItem(5);
        tabela.n = 5;

        int result = tabela.pesquisa(reg);

        assertEquals(5, result);
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
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item chave = new MeuItem(5);
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.registros[3] = new MeuItem(3);
        tabela.registros[4] = new MeuItem(4);
        tabela.registros[5] = new MeuItem(5);
        tabela.n = 5;

        int result = tabela.binaria(chave);

        assertEquals(5, result);
    }
}