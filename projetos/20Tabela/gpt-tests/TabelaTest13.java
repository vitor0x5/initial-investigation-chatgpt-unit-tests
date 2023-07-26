package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Tabela tabela = new Tabela();
        assertNotNull(tabela.registros);
        assertEquals(0, tabela.n);
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        Item reg3 = new MeuItem(30);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        tabela.registros[3] = reg3;
        assertEquals(1, tabela.pesquisa(reg1));
        assertEquals(2, tabela.pesquisa(reg2));
        assertEquals(3, tabela.pesquisa(reg3));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        Item reg3 = new MeuItem(30);
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        assertEquals(reg1, tabela.registros[1]);
        assertEquals(reg2, tabela.registros[2]);
        assertEquals(reg3, tabela.registros[3]);
        assertEquals(3, tabela.n);
    }

    @Test(timeout=1000)
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        Item reg3 = new MeuItem(30);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        tabela.registros[3] = reg3;
        assertEquals(0, tabela.binaria(new MeuItem(5)));
        assertEquals(1, tabela.binaria(reg1));
        assertEquals(2, tabela.binaria(reg2));
        assertEquals(3, tabela.binaria(reg3));
        assertEquals(0, tabela.binaria(new MeuItem(35)));
    }
}