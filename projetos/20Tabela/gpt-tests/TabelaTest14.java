package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
        assertEquals(0, tabela.n);
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.n = 2;

        Item item = new MeuItem(20);
        int result = tabela.pesquisa(item);
        assertEquals(2, result);

        item = new MeuItem(30);
        result = tabela.pesquisa(item);
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 3;
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.registros[3] = new MeuItem(30);

        Item item = new MeuItem(40);
        tabela.insere(item);
        assertEquals(4, tabela.n);
        assertEquals(item, tabela.registros[4]);

        try {
            item = new MeuItem(50);
            tabela.insere(item);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testBinaria() {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.registros[3] = new MeuItem(30);
        tabela.n = 3;

        Item item = new MeuItem(20);
        int result = tabela.binaria(item);
        assertEquals(2, result);

        item = new MeuItem(40);
        result = tabela.binaria(item);
        assertEquals(0, result);
    }
}