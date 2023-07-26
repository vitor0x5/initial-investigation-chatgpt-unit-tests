package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela.registros);
        assertEquals(0, tabela.n);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.registros[1] = item1;
        tabela.registros[2] = item2;
        tabela.n = 2;

        int index1 = tabela.pesquisa(item1);
        assertEquals(1, index1);

        int index2 = tabela.pesquisa(item2);
        assertEquals(2, index2);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        tabela.insere(item1);
        assertEquals(1, tabela.n);
        assertEquals(item1, tabela.registros[1]);

        Item item2 = new MeuItem(2);
        tabela.insere(item2);
        assertEquals(2, tabela.n);
        assertEquals(item2, tabela.registros[2]);
    }

    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.registros[1] = item1;
        tabela.registros[2] = item2;
        tabela.n = 2;

        int index1 = tabela.binaria(item1);
        assertEquals(1, index1);

        int index2 = tabela.binaria(item2);
        assertEquals(2, index2);
    }

    @Test(expected = Exception.class, timeout=1000)
    public void testInsereException() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 0; i < 11; i++) {
            Item item = new MeuItem(i);
            tabela.insere(item);
        }
    }
}