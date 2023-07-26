package ds;import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

import static org.junit.Assert.*;

public class TabelaTest11{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        Tabela tabela = new Tabela();
        assertEquals(0, tabela.n);
        assertEquals(11, tabela.registros.length);
    }

    @Test(timeout = 1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        int result = tabela.pesquisa(reg);
        assertEquals(1, result);
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        assertEquals(1, tabela.n);
        assertEquals(reg, tabela.registros[1]);
    }

    @Test(timeout = 1000)
    public void testInsere_Exception() {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        for (int i = 0; i < 10; i++) {
            try {
                tabela.insere(reg);
            } catch (Exception e) {
                fail("Exception thrown");
            }
        }
        try {
            tabela.insere(reg);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);

        Item chave1 = new MeuItem(3);
        Item chave2 = new MeuItem(5);
        Item chave3 = new MeuItem(7);

        int result1 = tabela.binaria(chave1);
        int result2 = tabela.binaria(chave2);
        int result3 = tabela.binaria(chave3);

        assertEquals(0, result1);
        assertEquals(1, result2);
        assertEquals(0, result3);
    }
}