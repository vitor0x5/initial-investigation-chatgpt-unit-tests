package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.*;

public class TabelaTest3{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertEquals(0, tabela.n);
        assertNull(tabela.registros[0]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.registros[3] = new MeuItem(30);
        tabela.n = 3;

        assertEquals(0, tabela.pesquisa(new MeuItem(5)));
        assertEquals(1, tabela.pesquisa(new MeuItem(10)));
        assertEquals(3, tabela.pesquisa(new MeuItem(30)));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 2;
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);

        tabela.insere(new MeuItem(30));
        assertEquals(3, tabela.n);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.registros[3] = new MeuItem(30);
        tabela.n = 3;

        assertEquals(0, tabela.binaria(new MeuItem(5)));
        assertEquals(1, tabela.binaria(new MeuItem(10)));
        assertEquals(3, tabela.binaria(new MeuItem(30)));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMethods() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 1;
        tabela.registros[1] = new MeuItem(10);

        assertEquals(-1, tabela.registros[1].compara(new MeuItem(20)));
        assertEquals(1, tabela.registros[1].compara(new MeuItem(5)));
        assertEquals(0, tabela.registros[1].compara(new MeuItem(10)));

        tabela.registros[1].alteraChave(20);

        assertEquals(20, tabela.registros[1].recuperaChave());

        assertEquals("20", tabela.registros[1].toString());
    }
}