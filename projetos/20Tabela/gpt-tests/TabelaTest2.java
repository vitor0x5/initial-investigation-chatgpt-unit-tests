package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class TabelaTest2{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        tabela.registros[0] = reg1;
        tabela.registros[1] = reg1;
        assertEquals(1, tabela.pesquisa(reg1));
    }

    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        tabela.insere(reg1);
        assertEquals(1, tabela.n);
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        tabela.registros[1] = reg1;
        assertEquals(1, tabela.binaria(reg1));
    }
}