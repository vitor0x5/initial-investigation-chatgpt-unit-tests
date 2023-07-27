package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest0{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela.registros);
        assertEquals(0, tabela.n);
    }

    // Test for pesquisa method
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.registros[1] = new MeuItem(3);
        tabela.registros[2] = new MeuItem(4);
        tabela.registros[3] = new MeuItem(5);
        tabela.n = 3;

        int result = tabela.pesquisa(reg);
        assertEquals(3, result);
    }

    // Test for insere method
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);

        tabela.insere(reg);
        assertEquals(1, tabela.n);
        assertEquals(reg, tabela.registros[1]);
    }

    // Test for insere method when tabela is full
    @Test(expected=Exception.class, timeout=1000)
    public void testInsereFullTabela() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 10;

        Item reg = new MeuItem(5);
        tabela.insere(reg);
    }

    // Test for binaria method when tabela is empty
    @Test(timeout=1000)
    public void testBinariaEmptyTabela() throws Exception {
        Tabela tabela = new Tabela();
        Item chave = new MeuItem(5);

        int result = tabela.binaria(chave);
        assertEquals(0, result);
    }

    // Test for binaria method when chave exists in tabela
    @Test(timeout=1000)
    public void testBinariaChaveExists() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 3;
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(3);
        tabela.registros[3] = new MeuItem(5);

        Item chave = new MeuItem(3);
        int result = tabela.binaria(chave);
        assertEquals(2, result);
    }

    // Test for binaria method when chave does not exist in tabela
    @Test(timeout=1000)
    public void testBinariaChaveDoesNotExist() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 3;
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(3);
        tabela.registros[3] = new MeuItem(5);

        Item chave = new MeuItem(2);
        int result = tabela.binaria(chave);
        assertEquals(0, result);
    }
}